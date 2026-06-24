package com.abc.demo.DoctorApp.DTO;

public class HospitalDTO {

	private int hospitalId;
	private String hospitalName;
	private String hospitalLocation;
private String username;
	
	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	public HospitalDTO(int hospitalId, String hospitalName, String hospitalLocation) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalLocation = hospitalLocation;
	}

	public HospitalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
