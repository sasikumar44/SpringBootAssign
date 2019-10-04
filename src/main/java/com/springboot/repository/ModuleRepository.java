package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Modules;

@Repository
public interface ModuleRepository extends JpaRepository<Modules, Long> {
	// Project findByProjectId(Long id);
}
