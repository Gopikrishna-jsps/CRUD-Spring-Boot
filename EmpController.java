package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmpRepo;

@RestController
public class EmpController {
	@Autowired
	
	EmpRepo empRepo;

	@PostMapping("/saveEmp")
	public Employee saveEmp(@RequestBody Employee employee) {
	return empRepo.save(employee);

}
}
