package com.example.springrestboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrestboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 

}
