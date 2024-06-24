package com.ranjith.springboot.thymleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjith.springboot.thymleafdemo.entity.Employee;

public interface EmployeeRepoistory extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
}
