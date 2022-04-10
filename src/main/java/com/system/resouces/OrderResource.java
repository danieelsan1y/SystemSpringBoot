package com.system.resouces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.entities.Order;
import com.system.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> lista = OrderService.findByAll();
		return ResponseEntity.ok().body(lista);
	}
	
    @GetMapping (value = "/{id}") 
    public ResponseEntity<Order> findById(@PathVariable Long id) {
    	Order obj = OrderService.findById(id);
    	return ResponseEntity.ok().body(obj);
    	
    }

}
