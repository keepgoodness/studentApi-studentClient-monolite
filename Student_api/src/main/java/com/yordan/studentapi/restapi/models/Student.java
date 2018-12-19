package com.yordan.studentapi.restapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jordan
 */
@Entity
@Table(name = "students")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 45)
	private String firstName;
	@Column(length = 45)
	private String middleName;
	@Column(length = 45)
	private String lastName;
	@Column(length = 10)
	private String facNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Faculty faculty;

	public Student() {
	}

	public Student(String firstName, String middleName, String lastName, String facNumber, Faculty faculty) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.facNumber = facNumber;
		this.faculty = faculty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFacNumber() {
		return facNumber;
	}

	public void setFacNumber(String facNumber) {
		this.facNumber = facNumber;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
