package com.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
