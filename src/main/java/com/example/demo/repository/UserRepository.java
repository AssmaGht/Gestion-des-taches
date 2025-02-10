package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


	User findByemail(String email);

	List<User> findByRole(Role r);

	List<User> findByStatus(String string);

	
}
