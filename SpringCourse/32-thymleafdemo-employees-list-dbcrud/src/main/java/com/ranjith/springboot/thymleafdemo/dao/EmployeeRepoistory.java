package com.ranjith.springboot.thymleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjith.springboot.thymleafdemo.entity.Employee;

public interface EmployeeRepoistory extends JpaRepository<Employee, Integer> {

}
