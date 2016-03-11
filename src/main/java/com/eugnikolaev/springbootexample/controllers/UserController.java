package com.eugnikolaev.springbootexample.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eugnikolaev.springbootexample.forms.UserCreateForm;
import com.eugnikolaev.springbootexample.routing.Routes;
import com.eugnikolaev.springbootexample.services.UserService;
import com.eugnikolaev.springbootexample.validators.UserCreateFormValidator;

@Controller
public class UserController {

    protected static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private UserCreateFormValidator userCreateFormValidator;

    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(userCreateFormValidator);
    }

    @RequestMapping(value = Routes.usersPath, method = RequestMethod.POST)
    public String handleUserCreateForm(
            @Valid @ModelAttribute("form") UserCreateForm form,
            BindingResult bindingResult,
            RedirectAttributes redirectAttrs) {
        if (bindingResult.hasErrors()) {
            return Routes.registerPath;
        }
        userService.create(form);
        redirectAttrs.addFlashAttribute("notice", "Registration was successful");
        return Routes.redirect(Routes.rootPath);
    }

}
