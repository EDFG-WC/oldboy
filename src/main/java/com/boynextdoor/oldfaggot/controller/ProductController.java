package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.LearnResouce;
import com.boynextdoor.oldfaggot.entity.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: wangc
 * @Date: 2018/10/28 21:01
 * @Description:
 */
@Controller
public class ProductController {

	@RequestMapping(value = "/getLearnResouce", method = RequestMethod.GET)
	public ModelAndView getProductList() {
		List<LearnResouce> learnList = new ArrayList<>();
		LearnResouce bean = new LearnResouce("官方参考文档", "Spring Boot Reference Guide",
				"http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
		learnList.add(bean);
		bean = new LearnResouce("官方SpriongBoot例子", "官方SpriongBoot例子",
				"https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
		learnList.add(bean);
		bean = new LearnResouce("龙国学院", "Spring Boot 教程系列学习",
				"http://www.roncoo.com/article/detail/125488");
		learnList.add(bean);
		bean = new LearnResouce("嘟嘟MD独立博客", "Spring Boot干货系列 ", "http://tengj.top/");
		learnList.add(bean);
		bean = new LearnResouce("后端编程嘟", "Spring Boot教程和视频 ",
				"http://www.toutiao.com/m1559096720023553/");
		learnList.add(bean);
		bean = new LearnResouce("程序猿DD", "Spring Boot系列",
				"http://www.roncoo.com/article/detail/125488");
		learnList.add(bean);
		bean = new LearnResouce("纯洁的微笑", "Sping Boot系列文章", "http://www.ityouknow.com/spring-boot");
		learnList.add(bean);
		bean = new LearnResouce("CSDN——小当博客专栏", "Sping Boot学习",
				"http://blog.csdn.net/column/details/spring-boot.html");
		learnList.add(bean);
		bean = new LearnResouce("梁桂钊的博客", "Spring Boot 揭秘与实战",
				"http://blog.csdn.net/column/details/spring-boot.html");
		learnList.add(bean);
		bean = new LearnResouce("林祥纤博客系列", "从零开始学Spring Boot ",
				"http://412887952-qq-com.iteye.com/category/356333");
		learnList.add(bean);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("learnList", learnList);
		modelAndView.setViewName("/index");
		return modelAndView;
	}


	@GetMapping("/getList")
	public String getList(Model model) {
		List<Product> productList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date createTime = null;
		try {
			createTime = sdf.parse("2018-10-20");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		productList.add(new Product(1, "iMac1", 15999.00, createTime, "挺贵, 我自己是不会买的"));
		productList.add(new Product(2, "iMac2", 15999.00, createTime, "挺贵, 我自己是不会买的"));
		productList.add(new Product(3, "iMac3", 15999.00, createTime, "挺贵, 我自己是不会买的"));
		productList.add(new Product(4, "iMac4", 15999.00, createTime, "挺贵, 我自己是不会买的"));
		productList.add(new Product(5, "iMac5", 15999.00, createTime, "挺贵, 我自己是不会买的"));

		model.addAttribute("productList", productList);
		return "products";
	}
}
