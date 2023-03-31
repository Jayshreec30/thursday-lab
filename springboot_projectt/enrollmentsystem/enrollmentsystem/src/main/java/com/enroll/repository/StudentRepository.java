package com.enroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.enroll.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	
}
