package com.ranjith.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjith.springboot.cruddemo.entity.Employee;

public interface EmployeeRepoistory extends JpaRepository<Employee, Integer> {

}
