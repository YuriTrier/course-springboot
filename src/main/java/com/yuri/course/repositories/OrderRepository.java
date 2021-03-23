package com.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
