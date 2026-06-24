package com.abc.demo.DoctorApp.SERVICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.abc.demo.DoctorApp.DTO.DoctorDTO;
import com.abc.demo.DoctorApp.DTO.HospitalDTO;
import com.abc.demo.DoctorApp.ENTITY.DoctorEntity;
import com.abc.demo.DoctorApp.REPOSITORY.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepo;
	
//	@Autowired
//	WebClient webClient;
	
	
	@Autowired
	RestTemplate template;
	
	// Create
	public void createDoctor(DoctorEntity doctorDetails) {
		doctorRepo.save(doctorDetails);
	}
	
	
	// Read All
	public List<DoctorEntity> readAllDoctors() {
//		return doctorRepo.findAll();
		
		List<DoctorEntity> allDoctorDetails = doctorRepo.findAll();
		return allDoctorDetails;
	}

	// Read One
	public ArrayList readParticularDoctor(int id) {
		DoctorEntity doctorInfo = doctorRepo.findById(id).get();
		
		int recievedHospitalID = doctorInfo.getHospitalId();//200
		

		
		HospitalDTO hospitalDetails = template.
		getForEntity
		("http://Hospital-App/hospital/"+recievedHospitalID,
				HospitalDTO.class).getBody();	
		
		ArrayList allDetails = new ArrayList();
		allDetails.add(doctorInfo);
		allDetails.add(hospitalDetails);
		
		return allDetails;
	}
	
//	public ArrayList readParticularDoctor(int id) {
//		DoctorEntity doctorInfo = doctorRepo.findById(id).get();
//		
//		int recievedHospitalID = doctorInfo.getHospitalId();//200
//		
//
//		HospitalDTO hospitalDetails = WebClient
//		.create().get()
//		.uri("http://localhost:8080/hospital/"+recievedHospitalID)
//		.retrieve().bodyToMono(HospitalDTO.class).block();
//
//		ArrayList allDetails = new ArrayList();
//		allDetails.add(doctorInfo);
//		allDetails.add(hospitalDetails);
//		
//		return allDetails;
//	}
	
	// Delete
	public void deleteParticularDoctor(int id) {
		doctorRepo.deleteById(id);
	}
}