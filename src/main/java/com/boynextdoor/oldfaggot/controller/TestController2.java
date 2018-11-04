package com.boynextdoor.oldfaggot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wangc
 * @Date: 2018/10/21 22:11
 * @Description: 使用@Controller注解, 不会把返回值成json, 返回的hello会指向hello.html
 */
@Controller
public class TestController2 {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("name", "老王");
        return "hello";
    }

}
