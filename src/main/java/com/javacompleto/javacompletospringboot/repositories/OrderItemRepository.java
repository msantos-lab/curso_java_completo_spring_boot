package com.javacompleto.javacompletospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.javacompletospringboot.entities.OrderItem;
import com.javacompleto.javacompletospringboot.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
