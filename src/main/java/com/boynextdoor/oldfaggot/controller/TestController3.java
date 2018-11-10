package com.boynextdoor.oldfaggot.controller;


import com.boynextdoor.oldfaggot.entity.User;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:00
 * @Description:
 */
@Controller
@RequestMapping("/test3")
public class TestController3 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        Map<String, Object> map = new HashMap<String, Object>();
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        if (!name.equals("") && address != "") {
            //User user =new User(userName,password);
            User user = new User();
            user.setName(name);
            user.setAddress(address);
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }
}