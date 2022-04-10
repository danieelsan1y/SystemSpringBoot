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

import com.system.entities.User;
import com.system.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> lista = userService.findByAll();
		return ResponseEntity.ok().body(lista);
	}
	
    @GetMapping (value = "/{id}") 
    public ResponseEntity<User> findById(@PathVariable Long id) {
    	User obj = userService.findById(id);
    	return ResponseEntity.ok().body(obj);
    	
    }

}
