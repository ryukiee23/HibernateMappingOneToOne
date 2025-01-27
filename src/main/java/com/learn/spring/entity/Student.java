package com.learn.spring.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student { //id,about,name ----> OneToOne --> 1 Student 1 Address
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String name;
	private String about;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Address> addresslist = new ArrayList<>();
	
	public Student() {
		super();
	}
	public Student(int studentId, String name, String about) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.about = about;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}
	
	
	

}
