package com.enroll.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enroll.entity.Enrollment;
import com.enroll.service.EnrollmentService;


@RestController
@RequestMapping("/api")
public class EnrollmentController 
{

		        @Autowired
		        private EnrollmentService enrollmentService;
		 
		        // Create a new enrollment
			    @PostMapping(value = "/enrollment")
			    public Enrollment create(@RequestBody Enrollment enrollment) 
			    {
				    return enrollmentService.createEnrollment(enrollment);
			    }
			    
			
			    // Get all existing enrollment
				@GetMapping("/enrollment")
				public List<Enrollment> getAll() 
				{
					return enrollmentService.getAllEnrollment();
				}
				
				
				// Get a enrollment
				@GetMapping(value = "/enrollment/{enrollmentId}")
				public Enrollment getEnrollment(@PathVariable int enrollmentId) 
				{
					return enrollmentService.getEnrollmentById(enrollmentId);
				}
				

				// Update enrollment
				@PutMapping(value = "/enrollment/{enrollmentId}")
				public Enrollment updateEnrollment(@PathVariable int enrollmentId, @RequestBody Enrollment enrollment) 
				{
					return enrollmentService.updateEnrollmentById(enrollment, enrollmentId);
				}
				
				
				// Delete enrollment
				@DeleteMapping(value = "/enrollment/{enrollmentId}")
				public String deleteEnrollment(@PathVariable int enrollmentId) 
				{
					return enrollmentService.deleteEnrollmentById(enrollmentId);
				}		    	   
}




