package com.boynextdoor.oldfaggot;

import com.alibaba.fastjson.JSON;
import com.boynextdoor.oldfaggot.entity.User;
import com.boynextdoor.oldfaggot.entity.UserExample;
import com.boynextdoor.oldfaggot.mapper.UserMapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: wangc
 * @Date: 2018/11/25 21:20
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
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
	}
}
