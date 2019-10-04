package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Defect;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {
	// Defect findDefectById(Long id);
}
