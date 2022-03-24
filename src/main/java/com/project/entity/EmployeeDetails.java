package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Email
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "contact")
	private Long contact;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "master",
	joinColumns= {
			@JoinColumn(name = "employee_id", referencedColumnName = "id")
	},
	        inverseJoinColumns = {
	        		@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	        }
	
	
	)
	private List<DepartmentDetails> departmentDetails;
	
	
	public EmployeeDetails() {
		
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

	public List<DepartmentDetails> getDepartmentDetails() {
		return departmentDetails;
	}

	public void setDepartmentDetails(List<DepartmentDetails> departmentDetails) {
		this.departmentDetails = departmentDetails;
	}

	public EmployeeDetails(Long id, @NotNull String name, @NotNull @Email String email,
			@NotNull @Size(min = 8, max = 10) Long contact, List<DepartmentDetails> departmentDetails) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.departmentDetails = departmentDetails;
	}
	
	
	

	

}
