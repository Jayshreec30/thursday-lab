package com.enroll.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.enroll.entity.College;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto 
{
	
	@NotBlank(message = "Invalid student Name:Empty name")
	@NotNull(message = "Invalid student Name:name is null")
	@Size(min=3,max=25,message="Invalid Name: Must be of 3 -25 characters")
	private String studentName;
	
	@Email(message="Invalid Name")
	private String studentEmail;
	
	@NotBlank(message="Invalid Phone no:Empty Number")
	@NotNull(message="Invalid Name:number is Null")
	@Pattern(regexp="^\\d{10}$",message ="Invalid Phone number")
	private Long studentMobile;
	
	@Size(min=3,max=50,message="Invalid Name: Must be of 3 -50 characters")
	private String studentAddress;
	
	// Create College Bean file object.
	private College college;

}
