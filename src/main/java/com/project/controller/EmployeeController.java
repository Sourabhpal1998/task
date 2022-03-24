package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.EmployeeDto;
import com.project.view.EmployeeInterface;

@RestController
public class  EmployeeController {
	
	
	@Autowired
	public EmployeeInterface  employeeInterface;
	
	
	@PostMapping("/save")
	public void saveDto(@RequestBody EmployeeDto dto) {
		 employeeInterface.saveDto(dto);
	}
	
	@GetMapping("/fetch")
	public
	
	

}
