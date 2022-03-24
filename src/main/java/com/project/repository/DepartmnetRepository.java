package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.DepartmentDetails;

@Repository
public interface DepartmnetRepository extends JpaRepository<DepartmentDetails, Long> {
	
	public DepartmentDetails findByDepartmentName(String departmentName);
	
	

}
