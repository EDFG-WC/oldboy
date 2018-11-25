package com.boynextdoor.oldfaggot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.Page;
import com.boynextdoor.oldfaggot.entity.User;
import com.boynextdoor.oldfaggot.entity.UserExample;
import com.boynextdoor.oldfaggot.entity.UserExample.Criteria;
import com.boynextdoor.oldfaggot.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test6")
public class TestController6 {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@RequestMapping("/getUser")
	public String findUserById(Model model, @RequestParam Long userId) {
		System.out.println(userId);
		User user = userMapper.selectByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "userPage";
	}

	@RequestMapping("/getUserList")
	@ResponseBody
	public BasicReturn getUserList(@RequestBody String param) {
		BasicReturn basicReturn = new BasicReturn();
		Page page = JSONObject.parseObject(param, Page.class);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusIsNotNull();
		List<User> userList = userMapper.selectByExample(null);
		//pageInfo是mybatis generator封装的信息
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		basicReturn.setBasicData(pageInfo);
		return basicReturn;
	}

	@RequestMapping("/initUserPage")
	public String initUserPage(Model model) {
		BasicReturn basicReturn = new BasicReturn();
		PageHelper.startPage(1, 3);
		List<User> userList = userMapper.selectByExample(null);
		PageInfo<User> pageInfo = new PageInfo<User>(userList);
		basicReturn.setBasicData(pageInfo);
		model.addAttribute("basicReturn", basicReturn);
		return "userPage2";
	}

	@RequestMapping("/redisTest")
	@ResponseBody
	public String redisTest() {
		//1. 以json的形式获取redis数据
		String userListJson = redisTemplate.boundValueOps("user.findAll").get();
		//2. 判断redis中是否存在数据
		if (null == userListJson) {
			try {
				//3. 不存在数据从数据库中查询
				UserExample example = new UserExample();
				List<User> userList = userMapper.selectByExample(example);
				//4. 结果转String类型
				userListJson = JSON.toJSONString(userList);
				//5. 存入模板
				redisTemplate.boundValueOps("user.findAll").set(userListJson);
				System.out.println("--->从数据库中查询的user");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("--->从redis中查询的user");
		}
		//6. 打印数据
		System.out.println(userListJson);
		return userListJson;
	}
}
