package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "subject_details")
public class SubjectDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String sId;
	
	@NotNull
	@Column(name = "subject_name")
	private String subjectName;
	
	
	public SubjectDetails() {
		
	}


	public String getsId() {
		return sId;
	}


	public void setsId(String sId) {
		this.sId = sId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public SubjectDetails(String sId, @NotNull String subjectName) {
		super();
		this.sId = sId;
		this.subjectName = subjectName;
	}
	
	
	
	

}
