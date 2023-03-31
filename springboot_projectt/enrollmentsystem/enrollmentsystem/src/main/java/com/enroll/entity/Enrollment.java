package com.enroll.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Enrollment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer enrollId;
	private String enrollStatus;
    //private Course course;
    //private Student student;
}
