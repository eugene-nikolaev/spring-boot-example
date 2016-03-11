package com.eugnikolaev.springbootexample.routing;

public abstract class Routes {

    public static final String rootPath = "/";

    public static final String loginPath = "/login";

    public static final String loginErrorPath = "/login?error";

    public static final String logoutPath = "/logout";

    public static final String registerPath = "/register";

    public static final String usersPath = "/users";

    public static final String redirect(String path) {
        return "redirect:" + path;
    }
}
