package com.Thursday_Lab;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Library {
	@Id
	int library_Id;
	String library_Name;
	
	@OneToMany(mappedBy = "library")
    List<Books> books;

	public int getLibrary_Id() {
		return library_Id;
	}

	public void setLibrary_Id(int library_Id) {
		this.library_Id = library_Id;
	}

	public String getLibrary_Name() {
		return library_Name;
	}

	public void setLibrary_Name(String library_Name) {
		this.library_Name = library_Name;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}
	

	
	
	
}
