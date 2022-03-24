package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.DepartmentDto;
import com.project.dto.EmployeeDto;
import com.project.entity.DepartmentDetails;
import com.project.entity.EmployeeDetails;
import com.project.repository.DepartmnetRepository;
import com.project.repository.EmployeeRepository;
import com.project.view.EmployeeInterface;

@Service
public class EmployeeService implements EmployeeInterface {

	
	  
	  @Autowired 
	  private DepartmnetRepository departmnetRepository;

	  @Autowired
	  private EmployeeRepository employeeRepository;
	  
	  
	  @Override
	  public void saveDto(EmployeeDto employeeDto) {
	  EmployeeDetails employeeDetails = new EmployeeDetails();
	  employeeDetails.setName(employeeDto.getName());
	  employeeDetails.setEmail(employeeDto.getEmail());
	  employeeDetails.setContact(employeeDto.getContact());
	  
	  List<DepartmentDto> departmentDtos = employeeDto.getDepartments();
	  List<DepartmentDetails> departmentDetails = new ArrayList<>();
	  
	  for (DepartmentDto departmentDto : departmentDtos) {
		  DepartmentDetails departmentDetail = departmnetRepository.findByDepartmentName(departmentDto.getname());
		  
		  departmentDetails.add(departmentDetail);
		  
		  
		
	}
	  
	  employeeDetails.setDepartmentDetails(departmentDetails);
	  employeeRepository.save(employeeDetails);
	  
	  
	  
	  
	  }
	  
}
