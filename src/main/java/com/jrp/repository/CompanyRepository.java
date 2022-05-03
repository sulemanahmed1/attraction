package com.jrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrp.model.Company;

public interface CompanyRepository  extends JpaRepository<Company, Long>{
	 
}
