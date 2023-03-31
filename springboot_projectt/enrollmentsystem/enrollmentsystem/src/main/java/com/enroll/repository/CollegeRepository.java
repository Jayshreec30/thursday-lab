package com.enroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enroll.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> 
{

}
