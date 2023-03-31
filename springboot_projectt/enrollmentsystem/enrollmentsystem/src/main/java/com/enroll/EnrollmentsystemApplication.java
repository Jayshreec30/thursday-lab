package com.enroll;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.enroll.entity.College;
import com.enroll.entity.Student;
import com.enroll.repository.CollegeRepository;

// @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
// @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
// @Configuration: allow to register extra beans in the context or import additional configuration classes
// @SpringBootApplication : Same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class EnrollmentsystemApplication implements CommandLineRunner
{
	// @Autowired annotation is performing Dependency Injection.
	@Autowired
	private CollegeRepository collegeRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(EnrollmentsystemApplication.class, args);
	}

	// @Override annotation denotes that the child class method overrides the base class method.
	@Override
	public void run(String... args) throws Exception 
	{
		// Create a object of college and assign the parameter values
		College c1=College.builder().collegeName("SND").collegeLocation("YEOLA")
				.collegePhoneno(123578926l).collegeEmail("snd@gmail.com").build();
		
		
		// Create a object of student and assign the parameter values
		Student s1=Student.builder().studentName("Bruce Lee").studentEmail("blw@gmail.com")
				.studentMobile(7856904510l).studentAddress("Bangalore").build();
		Student s2=Student.builder().studentName("Marie").studentEmail("marp5@gmail.com")
				.studentMobile(9856967810l).studentAddress("Andaman").build();
		
		
		// Set the Student details  to College through the list
		c1.setStudent(Arrays.asList(s1, s2));
		
		
		// save the all college details in collegerepository
		collegeRepository.save(c1);
				

 	System.out.println("=============All data saved Successfully ===================");
		
	}
}
