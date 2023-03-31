package com.enroll.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @AllArgsConstructor generates a constructor with one parameter for each field in your class, by default generated constructor will be public.
@AllArgsConstructor

// @NoArgsConstructor will generate a no arguments/default constructor, by default generated constructor will be public.
@NoArgsConstructor

//@Data annotation generates all the boilerplate that is normally associated with simple POJOs files / bean file.@Data is Lombok annotation to reduce the boilerplate code (getters/setters).
@Data

//@Builder annotation produces the code automatically using Builder pattern.
@Builder

// @Entity annotation defines that a class can be mapped to a table. And that is it, it is just a marker, like for example Serializable interface.
@Entity

public class College 
{
	// @Id annotation is used to specify the primary key of an entity. 
	@Id
	
	
	// @GeneratedValue consider the entry point for primary key generation, it provides the specification of generation strategies for the values of primary keys. 
	// Strategy: The primary key generation strategy that the persistence provider must use to generate the annotated entity primary key.
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int collegeId;
	
	private String collegeName;
	private String collegeLocation;
	private Long collegePhoneno;
	private String collegeEmail;
	
	// @OneToMany annotation is from the java persistence API specification. This annotation represents that a collection of objects are direct children of the current entity.
	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	
	// Create list and object of student bean file
	private List<Student> student;
}