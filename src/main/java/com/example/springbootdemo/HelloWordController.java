package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWordController {
    @RequestMapping(value= "/", method= RequestMethod.GET)
    public ModelAndView welcome() {
        System.out.println(getClass() + "- Welcome page is invoked.");

        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "Sping boot!");
        mav.setViewName("index");
        return mav;
    }
}
