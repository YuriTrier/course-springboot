package com.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
