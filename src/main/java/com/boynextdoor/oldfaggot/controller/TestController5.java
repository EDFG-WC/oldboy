package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.Fucker;
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
        Fucker fucker = new Fucker();
        fucker.setName("张三");
        fucker.setAge(29);
        fucker.setAddress("忠孝东路");
        basicReturn.setBasicData(fucker);
        return basicReturn;
    }

    @RequestMapping("/jsonTest1")
    public String getBasicReturn(Model model) {
        BasicReturn basicReturn = new BasicReturn();
        Fucker fucker = new Fucker();
        fucker.setName("张三");
        fucker.setAge(29);
        fucker.setAddress("忠孝东路");
        basicReturn.setBasicData(fucker);
        model.addAttribute("basicReturn", basicReturn);
        return "test1";
    }

    @RequestMapping("/ajaxTest")
    public String getAjaxResponse(Model model) {
        Fucker fucker = new Fucker();
        fucker.setName("李四");
        fucker.setAge(18);
        fucker.setAddress("新疆独山子市");
        model.addAttribute("user", fucker);
        return "test1";
    }

}
