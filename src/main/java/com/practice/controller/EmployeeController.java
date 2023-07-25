package com.practice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.practice.entities.Employee;
import com.practice.repositery.EmployeeRepositery;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepositery employeeRepositery;
	
	
	@PostMapping("/insert_employee")
	public String create_Employee(@RequestBody Employee employee)
	{
		employeeRepositery.save(employee);
		return "Employee is Created ..";
	}
	
	@GetMapping("/all_employee")
	public Iterable<Employee> getAllEmployee()
	{
		Iterable<Employee> findAll = employeeRepositery.findAll();
		return findAll;
	}
	
	@GetMapping("/Single_id/id")
	public Optional<Employee> get_Employee_By_ID(@RequestParam("id") ID id)
	{
		Optional<Employee> findById = employeeRepositery.findById(id);
		return findById;
	}
	
	

}
