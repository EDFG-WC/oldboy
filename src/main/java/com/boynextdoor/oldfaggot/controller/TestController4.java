package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.Fucker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangc
 * @Date: 2018/10/21 20:47
 * @Description: 测试页面, 把user对象带到页面.
 */
@Controller
@RequestMapping("/test4")
public class TestController4 {

    @GetMapping("/goToUserForm")
    public String goToUserForm(Model model) {
        Fucker fucker = new Fucker();
        /*user.setName("张三");
        user.setAge(29);
        user.setAddress("忠孝东路");*/
        model.addAttribute("user", fucker);
        model.addAttribute("username", "入门案例");
        return "userform";
    }

    @PostMapping("/add")
    public String getUser(Fucker fucker) {
        System.out.println("----------------------" + fucker);
        return "success";
    }

}
