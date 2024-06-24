package com.ranjith.cruddemo.dao;

import com.ranjith.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    Student updateStudent(int i);

    void updateStudentAll();
}
