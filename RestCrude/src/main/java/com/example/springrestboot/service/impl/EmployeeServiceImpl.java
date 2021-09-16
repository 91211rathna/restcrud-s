package com.example.springrestboot.service.impl;

import com.example.springrestboot.model.Employee;
import com.example.springrestboot.repository.EmployeeRepository;
import com.example.springrestboot.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee) ;
	}

	
	
}
