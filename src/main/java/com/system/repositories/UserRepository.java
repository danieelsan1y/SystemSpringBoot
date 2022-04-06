package com.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
