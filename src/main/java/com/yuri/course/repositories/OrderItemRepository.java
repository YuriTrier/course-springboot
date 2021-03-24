package com.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
