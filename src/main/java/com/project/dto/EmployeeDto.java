package com.project.dto;

import java.util.List;

public class EmployeeDto {
	
	private Long id;
	private String name;
	private String email;
	private Long contact;
	private List<DepartmentDto> departments;
	
	public EmployeeDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public List<DepartmentDto> getDepartments() {
		return departments;
	}

	public void setDepartments(List<DepartmentDto> departments) {
		this.departments = departments;
	}

	public EmployeeDto(Long id, String name, String email, Long contact, List<DepartmentDto> departments) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", departments=" + departments + "]";
	}
	
	
	
	

}
