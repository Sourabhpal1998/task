package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.SubjectDetails;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectDetails, Long> {

}
