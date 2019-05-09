package com.tc.dlxt.controller;

import com.tc.dlxt.entity.User;
import com.tc.dlxt.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("home")
@Controller
public class ShowController {

    @Autowired
    private UserService userService;

    @RequestMapping("toHello")
    public ModelAndView toHello(){
        ModelAndView mv = new ModelAndView();
        List<User> all = userService.findAll();
        System.out.println(all);
        mv.setViewName("hello");
        return mv;
    }
}
