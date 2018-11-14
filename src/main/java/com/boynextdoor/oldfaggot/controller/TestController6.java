package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.User;
import com.boynextdoor.oldfaggot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test6")
public class TestController6 {

  @Autowired
  private UserMapper userMapper;

  @RequestMapping("/getUser")
  public String findUserById(Model model, @RequestParam Long userId) {
    User user = userMapper.selectByPrimaryKey(userId);
    model.addAttribute("user", user);
    return "userPage";
  }
}
