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

import com.system.entities.Category;
import com.system.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
    @GetMapping (value = "/{id}") 
    public ResponseEntity<Category> findById(@PathVariable Long id) {
    	Category obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    	
    }

}