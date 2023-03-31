package com.enroll.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enroll.dto.StudentDto;
import com.enroll.entity.Student;
import com.enroll.service.StudentService;

	
@RestController
@RequestMapping("/api")
public class StudentController 
{
		        @Autowired
		        private StudentService studentService;
		 
		        // Create a new student
			    @PostMapping(value = "/student")
			    public ResponseEntity<Student> create(@RequestBody @Valid StudentDto studentdto) 
			    {
				    return new ResponseEntity<>(studentService.createStudent(studentdto), HttpStatus.CREATED);
			    }
			    
			
			    // Get all existing student
				@GetMapping("/student")
				public List<Student> getAll() 
				{
					return studentService.getAllStudent();
				}
				
				
				// Get a student
				@GetMapping(value = "/student/{studentId}")
				public Student getStudent(@PathVariable int studentId) 
				{
					return studentService.getStudentById(studentId);
				}

				
				
				// Update student
				@PutMapping(value = "/student/{studentId}")
				public Student updateStudent(@PathVariable int studentId, @RequestBody Student student) 
				{
					return studentService.updateStudentById(student, studentId);
				}
				
				
				// Delete student
				@DeleteMapping(value = "/student/{studentId}")
				public String deleteStudent(@PathVariable int studentId) 
				{
					return studentService.deleteStudentById(studentId);
				}		   
}


