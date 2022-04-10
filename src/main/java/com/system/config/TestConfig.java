package com.system.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.system.entities.Order;
import com.system.entities.User;
import com.system.repositories.OrderRepository;
import com.system.repositories.UserRepository;
import com.system.resouces.UserResource;
import com.system.service.OrderService;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(null,Instant.parse("2022-04-10T01:03:07Z") , u1);
		Order o2 = new Order(null,Instant.parse("2022-05-10T01:03:07Z") , u2);
		Order o3 = new Order(null,Instant.parse("2022-06-10T01:03:07Z") , u1);
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}
