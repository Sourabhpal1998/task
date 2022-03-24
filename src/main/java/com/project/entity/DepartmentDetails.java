package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "department_details")
public class DepartmentDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	
	@NotNull
	@Column(name = "department_name")
	private String departmentName;
	
	@NotNull
	@Column(name = "status")
	private String status;
	
	
	public DepartmentDetails() {
		
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DepartmentDetails(Long departmentId, @NotNull String departmentName, @NotNull String status) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.status = status;
	}
	
	
	

}
