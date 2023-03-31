package com.enroll.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.enroll.entity.Enrollment;


@Component
public interface EnrollmentService {
	Enrollment createEnrollment(Enrollment enrollment) ;
	
	List<Enrollment>getAllEnrollment();

	Enrollment getEnrollmentById(Integer enrollmentId);
	
	Enrollment updateEnrollmentById(Enrollment enrollment,int enrollmentId);
	
	String deleteEnrollmentById(Integer enrollmentId);

}
