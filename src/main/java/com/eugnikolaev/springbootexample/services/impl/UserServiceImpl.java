package com.eugnikolaev.springbootexample.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.eugnikolaev.springbootexample.entities.User;
import com.eugnikolaev.springbootexample.forms.UserCreateForm;
import com.eugnikolaev.springbootexample.repositories.UserRepository;
import com.eugnikolaev.springbootexample.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(UserCreateForm form) {
        User user = new User();
        user.setEmail(form.getEmail());
        user.setEncryptedPassword(new BCryptPasswordEncoder().encode(form.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

}
