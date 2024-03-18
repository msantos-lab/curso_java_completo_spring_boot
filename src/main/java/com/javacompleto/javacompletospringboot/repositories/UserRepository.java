package com.javacompleto.javacompletospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.javacompletospringboot.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
