package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.User;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:54
 * @Description: 第一个测试类, @RestController注解默认把值返回为json
 */
@RestController
public class TestController1 {

    @Resource
    private User user;

    @GetMapping("/test1")
    public String firstEntrance() {
        return "大家好，我的名字是" + user.getName() + "，我今年" + user.getAge() + "岁了，我在" + user.getAddress() + "工作！";
    }

}
