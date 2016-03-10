package com.eugnikolaev.springbootexample.routing;

public abstract class Routes {
    
    public static String rootPath = "/";
    
    public static String loginPath = "/login";
    
    public static String logoutPath = "/logout";

    public static String registerPath = "/register";
    
    public static String usersPath = "/users";
    
    public static String redirect(String path) {
        return "redirect:" + path;
    }
}
