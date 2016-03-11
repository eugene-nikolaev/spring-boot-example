package com.eugnikolaev.springbootexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eugnikolaev.springbootexample.routing.Routes;

@Controller
public class HomeController {
    
    @RequestMapping(Routes.rootPath)
    String index(RedirectAttributes redirAttrs, ModelMap modelMap) {
        return "index";
    }
}
