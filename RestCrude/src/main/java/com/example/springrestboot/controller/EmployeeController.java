package com.example.springrestboot.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestboot.model.Employee;
import com.example.springrestboot.service.EmployeeService;
@CrossOrigin(origins="http://localhost:8084")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("/Employees")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee)
	{
		try {
			return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
