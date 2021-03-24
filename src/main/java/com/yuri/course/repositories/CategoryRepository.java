package com.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
