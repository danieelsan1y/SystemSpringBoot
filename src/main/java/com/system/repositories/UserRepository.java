package com.system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findByName(String name);
	
}
