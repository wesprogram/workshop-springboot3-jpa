package com.wesprogram.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesprogram.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
