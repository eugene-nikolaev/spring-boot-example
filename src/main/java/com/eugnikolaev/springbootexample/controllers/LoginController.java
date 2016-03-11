package com.eugnikolaev.springbootexample.controllers;

import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eugnikolaev.springbootexample.routing.Routes;

@Controller
public class LoginController {
    
    //@Autowired
    //private Authentication auth;

    @RequestMapping(value = Routes.loginPath, method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam Optional<String> error, Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            return new ModelAndView(Routes.redirect(Routes.rootPath));
        }
        return new ModelAndView("login", "error", error.isPresent());
    }

}