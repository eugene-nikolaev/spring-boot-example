package com.eugnikolaev.springbootexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eugnikolaev.springbootexample.forms.UserCreateForm;
import com.eugnikolaev.springbootexample.routing.Routes;

@Controller
public class PagesController {

    @RequestMapping(Routes.registerPath)
    String register(ModelMap map, RedirectAttributes redirectAttrs) {
        map.put("form", new UserCreateForm());
        return Routes.registerPath;
    }
    
}
