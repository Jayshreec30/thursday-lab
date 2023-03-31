package com.enroll.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.enroll.dto.CollegeDto;
import com.enroll.entity.College;

@Component
public interface CollegeService {
College createCollege(CollegeDto collegedto) ;
	
	List<College>getAllCollege();

	College getCollegeById(Integer collegeId);
	
	College updateCollegeById(College college,int collegeId);
	
	String deleteCollegeById(Integer collegeId);
}
