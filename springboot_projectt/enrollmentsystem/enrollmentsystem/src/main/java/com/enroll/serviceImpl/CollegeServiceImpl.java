package com.enroll.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enroll.dto.CollegeDto;
import com.enroll.entity.College;
import com.enroll.repository.CollegeRepository;
import com.enroll.service.CollegeService;

// @Service annotation is used with classes that provide some business functionalities.It is a specialization of the component annotation.
@Service
public class CollegeServiceImpl implements CollegeService 
{
	// @Autowired annotation is performing Dependency Injection.
    @Autowired 
    private CollegeRepository collegeRepository;
	
    // @Override annotation denotes that the child class method overrides the base class method.
    @Override
	public College createCollege(CollegeDto collegedto) 
    {
		College college = College.builder().collegeName(collegedto.getCollegeName())
				.collegePhoneno(collegedto.getCollegePhoneno())
				.collegeLocation(collegedto.getCollegeLocation())
				.collegeEmail(collegedto.getCollegeEmail())
				.student(collegedto.getStudent()).build();
		return collegeRepository.save(college);
	}

    
    
	@Override
	public List<College> getAllCollege() 
	{
		return collegeRepository.findAll();
	}

	
	
	@Override
	public College getCollegeById(Integer collegeId) 
	{
		return collegeRepository.findById(collegeId).get();
	}

	
	@Override
	public College updateCollegeById(College college, int collegeId) 
	{
		College _college=collegeRepository.findById(collegeId).get();
		_college.setCollegeName(college.getCollegeName());
		_college.setCollegeLocation(college.getCollegeLocation());
		_college.setCollegePhoneno(college.getCollegePhoneno());
		_college.setCollegeEmail(college.getCollegeEmail());
		return collegeRepository.save(_college);
	}
	
	

	@Override
	public String deleteCollegeById(Integer collegeId) 
	{
         collegeRepository.findById(collegeId);
		
		return "The college is deleted";
	}
}
