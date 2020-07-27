package stu.lt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import stu.lt.demo.entity.User;
import stu.lt.demo.service.UserService;

import java.util.List;

/**
 * @Author LinuY
 * @Date 2020/7/15 22:48
 */
@Controller("demoController")
@RequestMapping("/demo")
public class DemoController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public void list() {
        List<User> users = userService.list();

    }
}
