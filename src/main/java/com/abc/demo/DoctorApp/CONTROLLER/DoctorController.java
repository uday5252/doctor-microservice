package com.abc.demo.DoctorApp.CONTROLLER;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abc.demo.DoctorApp.DTO.DoctorDTO;
import com.abc.demo.DoctorApp.ENTITY.DoctorEntity;
import com.abc.demo.DoctorApp.SERVICE.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	// Create: POST http://localhost:8080/doctor/create
	@PostMapping("/create")
	public void createDoctor(@RequestBody DoctorEntity doctorDetails) {
		doctorService.createDoctor(doctorDetails);
	}
	
	// Read All: GET http://localhost:8080/doctor/all
	@GetMapping("/all")
	public List<DoctorEntity> getAllDoctors() {
		return doctorService.readAllDoctors();
	}
	
	// Read One: GET http://localhost:8080/doctor/1
	@GetMapping("/{id}")
	public ArrayList getDoctor(@PathVariable int id) {
		return doctorService.readParticularDoctor(id); 
	}
	
	// Delete: DELETE http://localhost:8080/doctor/delete/1
	@DeleteMapping("/delete/{id}")
	public void deleteDoctor(@PathVariable int id) {
		doctorService.deleteParticularDoctor(id);
	}
}