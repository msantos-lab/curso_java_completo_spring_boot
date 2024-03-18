package com.javacompleto.javacompletospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacompleto.javacompletospringboot.entities.Product;
import com.javacompleto.javacompletospringboot.repositories.ProductRepository;


@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product finById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
