package com.boynextdoor.oldfaggot.controller;

import com.alibaba.fastjson.JSONObject;
import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.Page;
import com.boynextdoor.oldfaggot.entity.User;
import com.boynextdoor.oldfaggot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test6")
public class TestController6 {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/getUser")
	public String findUserById(Model model, @RequestParam Long userId) {
		System.out.println(userId);
		User user = userMapper.selectByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "userPage";
	}

	@RequestMapping("/getUserList")
	public BasicReturn getUserList(@RequestBody String param) {
		BasicReturn basicReturn = new BasicReturn();
		Page page = JSONObject.parseObject(param, Page.class);
		
	}
}
