package com.abc.demo.DoctorApp.ENTITY;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "doctors")
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	
	@NotBlank(message = "Name is required")
	@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
	private String doctorName;
	
	@NotNull(message = "Age is required")
	@Min(value = 25, message = "Minimum age required is 25")
	@Max(value = 60, message = "Maximum age is 60")
	private Integer doctorAge;
	
	public Integer getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public Integer getDoctorAge() {
		return doctorAge;
	}


	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}


	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}


	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}


	public Integer getDoctorSalary() {
		return doctorSalary;
	}


	public void setDoctorSalary(Integer doctorSalary) {
		this.doctorSalary = doctorSalary;
	}


	public int getHospitalId() {
		return hospitalId;
	}


	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}


	public DoctorEntity(Integer doctorId,
			@NotBlank(message = "Name is required") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String doctorName,
			@NotNull(message = "Age is required") @Min(value = 25, message = "Minimum age required is 25") @Max(value = 60, message = "Maximum age is 60") Integer doctorAge,
			@NotBlank(message = "Speciality is required") String doctorSpeciality,
			@NotNull(message = "Salary is required") @Min(value = 0, message = "Salary cannot be negative") Integer doctorSalary,
			int hospitalId) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorSpeciality = doctorSpeciality;
		this.doctorSalary = doctorSalary;
		this.hospitalId = hospitalId;
	}


	public DoctorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	@NotBlank(message = "Speciality is required")
	private String doctorSpeciality;
	
	@NotNull(message = "Salary is required")
	@Min(value = 0, message = "Salary cannot be negative")
	private Integer doctorSalary;
	
	
	private int hospitalId;
	

	
}