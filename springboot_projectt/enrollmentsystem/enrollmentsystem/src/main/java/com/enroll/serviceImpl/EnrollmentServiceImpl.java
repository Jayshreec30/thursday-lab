package com.enroll.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enroll.entity.Enrollment;
import com.enroll.repository.EnrollmentRepository;
import com.enroll.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService 
{

	@Autowired
    private  EnrollmentRepository enrollmentRepository; 
	
	@Override
	public Enrollment createEnrollment(Enrollment enrollment) 
	{
		return enrollmentRepository.save(enrollment);
	}

	
	@Override
	public List<Enrollment> getAllEnrollment() 
	{
		return enrollmentRepository.findAll();
	}

	
	@Override
	public Enrollment getEnrollmentById(Integer enrollmentId) 
	{
		return enrollmentRepository.findById(enrollmentId).get();
	}
	

	@Override
	public Enrollment updateEnrollmentById(Enrollment enrollment, int enrollmentId) 
	{
	   Enrollment _enrollment=enrollmentRepository.findById(enrollmentId).get();
	   _enrollment.setEnrollStatus(enrollment.getEnrollStatus());
	    return enrollmentRepository.save(_enrollment);
	}

	
	
	@Override
	public String deleteEnrollmentById(Integer enrollmentId) 
	{
		enrollmentRepository.findById(enrollmentId);
		
		return "The enrollment is deleted";
	}
}
