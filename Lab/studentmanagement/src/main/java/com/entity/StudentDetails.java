package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentDetails")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// variables
	@Column(name = "id")
	private int id;

	@Column(name = "address")
	private String address;

	@Column(name = "classNo")
	private int classNo;

	@OneToOne(mappedBy = "studentDetails", cascade = CascadeType.ALL)
	private Student student;

	// default constructor
	public StudentDetails() {

	}

	// Parameterized Constructor
	public StudentDetails(String address, int classNo) {
		super();
		this.address = address;
		this.classNo = classNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", address=" + address + ", classNo=" + classNo + "]";
	}

}
