package com.practice.entities;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
    private String firstName;
    private String middleName;
    private String surname;
    
    @JsonFormat(pattern="dd-mm-yyyy")
    private LocalDate dateOfBirth;
    
    private String gender;
    
    @JsonFormat(pattern="dd-mm-yyyy")
    private LocalDate dateOfJoining;
    
    @JsonFormat(pattern="dd-mm-yyyy")
    private LocalDate dateOfRetirement;
    
    private String bloodGroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public LocalDate getDateOfRetirement() {
		return dateOfRetirement;
	}

	public void setDateOfRetirement(LocalDate dateOfRetirement) {
		this.dateOfRetirement = dateOfRetirement;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Employee(int id, String firstName, String middleName, String surname, LocalDate dateOfBirth, String gender,
			LocalDate dateOfJoining, LocalDate dateOfRetirement, String bloodGroup) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.dateOfJoining = dateOfJoining;
		this.dateOfRetirement = dateOfRetirement;
		this.bloodGroup = bloodGroup;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", surname=" + surname
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", dateOfJoining=" + dateOfJoining
				+ ", dateOfRetirement=" + dateOfRetirement + ", bloodGroup=" + bloodGroup + "]";
	}
    
    
    
	

}
