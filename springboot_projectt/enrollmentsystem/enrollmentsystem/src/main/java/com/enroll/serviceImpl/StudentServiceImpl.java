package com.enroll.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enroll.dto.StudentDto;
import com.enroll.entity.Student;
import com.enroll.repository.StudentRepository;
import com.enroll.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService 
{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student createStudent(StudentDto studentdto) 
	{
		Student student= Student.builder().studentName(studentdto.getStudentName())
				.studentMobile(studentdto.getStudentMobile())
				.studentEmail(studentdto.getStudentEmail())
				.studentAddress(studentdto.getStudentAddress())
				.college(studentdto.getCollege()).build();
		return studentRepository.save(student);
	}
	

	@Override
	public List<Student> getAllStudent() 
	{
		return studentRepository.findAll();
	}
	

	@Override
	public Student getStudentById(Integer studentId) 
	{
		return studentRepository.findById(studentId).get();
	}

	
	@Override
	public Student updateStudentById(Student student, int studentId) 
	{
		// TODO Auto-generated method stub
		Student _student=studentRepository.findById(studentId).get();
		_student.setStudentName(student.getStudentName());
		_student.setStudentMobile(student.getStudentMobile());
		_student.setStudentEmail(student.getStudentEmail());
		_student.setStudentAddress(student.getStudentAddress());
		
		return studentRepository.save(_student);
	}

	
	@Override
	public String deleteStudentById(Integer studentId) 
	{
		studentRepository.findById(studentId);
		return "the student is deleted";
	}
	
//	public List<Student>getStudentByName(String studentName)
//	{
//		return studentRepository.findByStudentName(studentName);
//	}

}
