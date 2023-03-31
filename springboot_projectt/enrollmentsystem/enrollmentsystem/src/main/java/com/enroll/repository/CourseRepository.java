package com.enroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enroll.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> 
{

}
