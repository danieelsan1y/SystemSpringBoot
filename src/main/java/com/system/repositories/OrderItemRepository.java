package com.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
