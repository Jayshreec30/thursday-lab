package com.enroll.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.enroll.dto.StudentDto;
import com.enroll.entity.Student;
@Component
public interface StudentService {
Student createStudent(StudentDto studentdto) ;
	
	List<Student>getAllStudent();

	Student getStudentById(Integer studentId);
	
	Student updateStudentById(Student student,int studentId);
	
	String deleteStudentById(Integer studentId);
	
	// List<Student>getStudentByName(String studentName);
		
	

}
