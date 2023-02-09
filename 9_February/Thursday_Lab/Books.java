package com.Thursday_Lab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_Id;
	private String booK_Name;
	
	@ManyToOne
	@JoinColumn(name ="library_Id")
	private Library library;

	public int getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}

	public String getBooK_Name() {
		return booK_Name;
	}

	public void setBooK_Name(String booK_Name) {
		this.booK_Name = booK_Name;
	}

	public Library getLibrary(Library l1) {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	
}
