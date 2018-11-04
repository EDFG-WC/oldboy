package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.TestEntity;
import com.boynextdoor.oldfaggot.entity.User;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangc
 * @Date: 2018/10/21 20:47
 * @Description:
 */
@RestController
@RequestMapping("/init")
public class TestController4 {

    @Resource
    private TestEntity testEntity;
    @Resource
    private User user;

    /**
     * @Description: 练习入口类
     * @param: []
     * @return: java.lang.String
     * @auther: wangc
     * @date: 2018/10/21 23:00
     */
    @RequestMapping(value = "/firstEntrance", method = RequestMethod.GET)
    public String firstEntrance() {
        return "大家好，我的名字是" + user.getName() + "，我今年" + user.getAge() + "岁了，我在" + user.getAddress() + "工作！";
    }

    @GetMapping("/fuckTest")
    public TestEntity myTest() {
        return testEntity;
    }
}
