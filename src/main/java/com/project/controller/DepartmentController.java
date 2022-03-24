
  package com.project.controller;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.project.dto.EmployeeDto; import
  com.project.entity.EmployeeDetails; import
  com.project.repository.DepartmnetRepository;
  
  @RestController
  
  @RequestMapping("/") 
  public class DepartmentController {
  
  
  @Autowired
  private DepartmnetRepository departmnetRepository;
  
  
  @PostMapping("/")
  public void saveDto(@RequestBody EmployeeDto employeeDto) {
  EmployeeDetails employeeDetails = new EmployeeDetails();
  employeeDetails.setName(employeeDto.getName());
  employeeDetails.setEmail(employeeDto.getEmail());
  employeeDetails.setContact(employeeDto.getContact());
  
  }
  
  
  
  }
 