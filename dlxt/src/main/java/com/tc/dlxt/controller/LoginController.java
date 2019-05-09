package com.tc.dlxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/Login")
@Controller
public class LoginController {

    @RequestMapping("/toLogin")
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
}
