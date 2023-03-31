package com.enroll.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.enroll.entity.Course;

@Component

public interface CourseService {
	
	Course createCourse(Course course) ;
	
	List<Course>getAllCourse();

	Course getCourseById(Integer courseId);
	
	Course updateCourseById(Course course,int courseId);
	
	String deleteCourseById(Integer courseId);

}
