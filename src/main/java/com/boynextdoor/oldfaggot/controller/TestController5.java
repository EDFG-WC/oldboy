package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wangc
 * @Date: 2018/11/10 10:48
 * @Description: thymeleaf+json+ajax的测试
 */
@Controller
@RequestMapping("/test5")
public class TestController5 {

    @RequestMapping("/jsonTest")
    @ResponseBody
    public BasicReturn getBasicReturn() {
        BasicReturn basicReturn = new BasicReturn();
        User user = new User();
        user.setName("张三");
        user.setAge(29);
        user.setAddress("忠孝东路");
        basicReturn.setBasicData(user);
        return basicReturn;
    }

    @RequestMapping("/jsonTest1")
    public String getBasicReturn(Model model) {
        BasicReturn basicReturn = new BasicReturn();
        User user = new User();
        user.setName("张三");
        user.setAge(29);
        user.setAddress("忠孝东路");
        basicReturn.setBasicData(user);
        model.addAttribute("basicReturn", basicReturn);
        return "test1";
    }

    @RequestMapping("/ajaxTest")
    public String getAjaxResponse(Model model) {
        User user = new User();
        user.setName("李四");
        user.setAge(18);
        user.setAddress("新疆独山子市");
        model.addAttribute("user", user);
        return "test1";
    }

}
