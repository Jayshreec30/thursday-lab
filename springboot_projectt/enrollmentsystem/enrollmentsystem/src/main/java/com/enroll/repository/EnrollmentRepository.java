package com.enroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enroll.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> 
{

}
