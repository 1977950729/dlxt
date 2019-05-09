package com.tc.dlxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("home")
@Controller
public class ShowController {


    @RequestMapping("toHello")
    public ModelAndView toHello(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("hello");
        return mv;
    }
}
