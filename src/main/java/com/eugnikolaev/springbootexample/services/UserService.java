package com.eugnikolaev.springbootexample.services;

import java.util.Optional;

import com.eugnikolaev.springbootexample.entities.User;
import com.eugnikolaev.springbootexample.forms.UserCreateForm;

public interface UserService {
    
    /**
     * Creates a user based on form data
     * @param form user form data
     * @return newly created user 
     */
    User create(UserCreateForm form);
    
    Optional<User> getUserByEmail(String email);
}
