package com.eugnikolaev.springbootexample.security.model;

import org.springframework.security.core.authority.AuthorityUtils;

import com.eugnikolaev.springbootexample.entities.User;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = -2777923311145245780L;

    private User user;

    public CurrentUser(User user) {
        // FIXME: no roles for now
        super(user.getEmail(), user.getEncryptedPassword(), AuthorityUtils.createAuthorityList("user"));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

}