package com.abc.demo.DoctorApp.DTO;

public class DoctorDTO {
	
	private int doctorId;
	private String doctorName;
	private String doctorSpeciality;
	private int doctorAge;
	private int hospitalId;
	
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public int getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public DoctorDTO(int doctorId, String doctorName, String doctorSpeciality, int doctorAge, int hospitalId) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpeciality = doctorSpeciality;
		this.doctorAge = doctorAge;
		this.hospitalId = hospitalId;
	}

	public DoctorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
