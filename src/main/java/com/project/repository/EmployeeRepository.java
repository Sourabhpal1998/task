package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.EmployeeDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	EmployeeDetails findByName(String name);

	List<EmployeeDetails> findByNameOrderByIdDesc(String name);

	
	
	

}
