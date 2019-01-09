package com.codegym.CaseStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class View {
    @GetMapping("/")
    public String view(){
        return "view";

    }
}
