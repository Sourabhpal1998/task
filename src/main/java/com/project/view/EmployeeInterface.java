package com.project.view;

import java.util.List;

import com.project.dto.EmployeeDto;
import com.project.entity.EmployeeDetails;

public interface EmployeeInterface {
	
	public void saveDto(EmployeeDto employeeDto);
	
	public List<EmployeeDetails> findAll();

	public EmployeeDetails findByName(String name);

	

}
