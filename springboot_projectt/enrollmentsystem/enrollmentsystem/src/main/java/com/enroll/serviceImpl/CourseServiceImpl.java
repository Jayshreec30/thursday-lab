package com.enroll.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enroll.entity.Course;
import com.enroll.repository.CourseRepository;
import com.enroll.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService 
{

	@Autowired
	CourseRepository courseRepository;
	
	
	@Override
	public Course createCourse(Course course) 
	{
		return courseRepository.save(course);
	}
	

	@Override
	public List<Course> getAllCourse() 
	{	
		return courseRepository.findAll();
	}

	
	@Override
	public Course getCourseById(Integer courseId) 
	{
		return courseRepository.findById(courseId).get();
	}

	
	
	@Override
	public Course updateCourseById(Course course, int courseId) 
	{
		Course _course=courseRepository.findById(courseId).get();
		_course.setCourseName(course.getCourseName());
		_course.setCourseDescription(course.getCourseDescription());
		_course.setCourseFees(course.getCourseFees());
		_course.setSeats(course.getSeats());
		return courseRepository.save(_course);
	}

	
	@Override
	public String deleteCourseById(Integer courseId) 
	{
		courseRepository.findById(courseId);
		
		return "The course is deleted";
	}
}
