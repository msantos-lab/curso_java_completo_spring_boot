package com.javacompleto.javacompletospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.javacompletospringboot.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
