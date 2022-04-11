package com.system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entities.Category;
import com.system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
