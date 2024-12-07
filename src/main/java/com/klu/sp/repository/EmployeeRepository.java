package com.klu.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.sp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
