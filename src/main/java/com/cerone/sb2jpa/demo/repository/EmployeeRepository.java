package com.cerone.sb2jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerone.sb2jpa.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
