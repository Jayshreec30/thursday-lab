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
import com.enroll.dto.CollegeDto;
import com.enroll.entity.College;
import com.enroll.service.CollegeService;


// Restcontroller annotation, which marks the class as a controller where every method returns a domain object instead of a view.
@RestController

// RequestMapping  annotation for mapping HTTP GET requests onto specific handler methods.
@RequestMapping("/api")

public class CollegeController 
{
	        @Autowired
	        private CollegeService collegeService;
	 
	        // Create a new enrollment
	        // @Valid annotation is used to validate form before trying save it to database
	        // @ResponseBody annotation Spring treats the result of the method as the response itself.
	        // @PostMapping annotation used to maps the HTTP POST requests on the specific handler method.It is used to create a web service endpoint that creates. 
		    @PostMapping(value = "/college")
		    public  ResponseEntity<College> createCollege(@RequestBody @Valid CollegeDto collegedto) 
		   {
			    return new ResponseEntity<>(collegeService.createCollege(collegedto),HttpStatus.CREATED);
		   }
		
		    
		    
		
		    // Get all existing enrollment
		    // @GetMapping Annotation used to maps the HTTP GET requests on the specific handler method.It is used to create a web service endpoint that fetches.
			@GetMapping("/college")
			public List<College> getAll() 
			{
				return collegeService.getAllCollege();
			}
			
			
			
			
		    // Get a enrollment by using ID
			// @PathVariable annotation, we bind the request URL template path variable to the method variable.
			@GetMapping(value = "/college/{collegeId}")
			public College getCollege(@PathVariable int collegeId) 
			{
				return collegeService.getCollegeById(collegeId);
			}

			
			
			
			// Update enrollment
			// @PutMapping annotation used to maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates.
			// @PathVariable: It is used to extract the values from the URL. It is most suitable for the RESTful web service, where the URL contains a path variable. 
			// @RequestBody: It is used to bind HTTP request with an object in a method parameter. 
			@PutMapping(value = "/college/{collegeId}")
			public College updateCollege(@PathVariable int collegeId, @RequestBody College college) 
			{
				return collegeService.updateCollegeById(college, collegeId);
			}
			
			
			
			
			// Delete enrollment
			// @DeleteMapping annotation used to maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource.
			@DeleteMapping(value = "/college/{collegeId}")
			public String deleteCollege(@PathVariable int collegeId) 
			{
				return collegeService.deleteCollegeById(collegeId);
			}	   
}
