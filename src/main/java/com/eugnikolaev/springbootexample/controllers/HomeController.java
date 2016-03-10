package com.eugnikolaev.springbootexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    String index(RedirectAttributes redirAttrs, ModelMap modelMap) {
        return "index";
    }
}
