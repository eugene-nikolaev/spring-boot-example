package com.eugnikolaev.springbootexample.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugnikolaev.springbootexample.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findOneByEmail(String email);
}
