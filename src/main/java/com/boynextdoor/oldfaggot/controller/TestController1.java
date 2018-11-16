package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.BaiduEntity;
import com.boynextdoor.oldfaggot.entity.Fucker;
import com.boynextdoor.oldfaggot.entity.TestEntity;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:54
 * @Description: 第一个测试类, 用来用来读取xml和yml文件里的配置
 */
@Controller
@RequestMapping("/test1")
public class TestController1 {

	@Resource
	private Fucker fucker;

	@Resource
	private BaiduEntity baiduEntity;

	@Resource
	private TestEntity testEntity;

	@GetMapping("/getUser")
	@ResponseBody
	public String firstEntrance() {
		return "大家好，我的名字是" + fucker.getName() + "，我今年" + fucker.getAge() + "岁了，我住在" + fucker
				.getAddress()
				+ "！";
	}

	@GetMapping("/getBaidu")
	@ResponseBody
	public BaiduEntity getHaha() {
		return baiduEntity;
	}

	@GetMapping("/xmlTest")
	@ResponseBody
	public TestEntity myTest() {
		return testEntity;
	}

}
