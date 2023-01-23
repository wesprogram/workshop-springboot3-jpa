package com.wesprogram.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesprogram.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
