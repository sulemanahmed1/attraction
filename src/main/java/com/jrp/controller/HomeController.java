package com.jrp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrp.model.Company;
import com.jrp.repository.CompanyRepository;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@Autowired
	CompanyRepository companyRepository; 
	
	@GetMapping("/companies")
	private List<Company> getAllJsons(){
		return companyRepository.findAll();
	}	

	@GetMapping("/company/{companyid}")
	private Optional<Company> getCompany(@PathVariable("companyid") Long companyid) {
		
		return companyRepository.findById(companyid);
	}
	
/*	@PostMapping("/company")
	public Long saveCompany(@RequestBody Company company) {
		companyRepository.save(company);
		return company.getId();
	}
	*/
	@PostMapping("/company")
	public ResponseEntity<Company> saveCompany(@RequestBody Company company) {	
		companyRepository.save(company);
		return new ResponseEntity<Company>(company, HttpStatus.OK);
	}
}