package com.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entities.Order;
import com.system.repositories.OrderRepository;



@Service
public class OrderService {

	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findByAll() {
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
    
	
	
	
}
