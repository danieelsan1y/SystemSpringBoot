package com.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
