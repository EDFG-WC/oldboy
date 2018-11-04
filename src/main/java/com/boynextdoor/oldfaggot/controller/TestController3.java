package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.HahaEn;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:00
 * @Description:
 */
@RestController
public class TestController3 {

    @Resource
    private HahaEn hahaEn;

    @GetMapping("/haha")
    public HahaEn getHaha() {
        return hahaEn;
    }
}
