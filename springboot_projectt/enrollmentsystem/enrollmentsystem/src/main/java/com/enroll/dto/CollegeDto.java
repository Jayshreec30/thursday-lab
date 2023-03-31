package com.enroll.dto;

import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.enroll.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data annotation generates all the boilerplate that is normally associated with simple POJOs files / bean file.@Data is Lombok annotation to reduce the boilerplate code (getters/setters).
@Data

// @Builder annotation produces the code automatically using Builder pattern.
@Builder

// @NoArgsConstructor will generate a no arguments/default constructor, by default generated constructor will be public.
@NoArgsConstructor

// @AllArgsConstructor generates a constructor with one parameter for each field in your class, by default generated constructor will be public.
@AllArgsConstructor

public class CollegeDto 
{
	// @NotBlank annotation: A constrained String is valid as long as it's not null, and the trimmed length is greater than zero.
	// @NotNull annotation: A constrained CharSequence, Collection, Map, or Array is valid as long as it's not null, but it can be empty.
	// @Pattern annotation makes sure that the value passed to the data member follows the provided regular expressions. 
	
	@NotBlank(message = "Invalid College Name:Empty name")
	@NotNull(message = "Invalid college name:name is null")
	private String collegeName;
	
	@NotBlank(message = "Invalid location:Empty name")
	@NotNull(message = "Invalid location:name is null")
	private String collegeLocation;
	
	@NotBlank(message="Invalid Phone no:Empty Number")
	@NotNull(message="Invalid Name:number is Null")
	@Pattern(regexp="^\\d{10}$",message ="Invalid Phone number")
	private Long collegePhoneno;
	
	@Email(message="Invalid Name")
	private String collegeEmail;
	
	// Create a list and object of student bean file. 
	private List<Student> student;
}
