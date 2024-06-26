package com.ranjith.cruddemo.dao;

import com.ranjith.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager for constructor injection
@Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implament save method


    @Override
@Transactional
    public void save(Student student) {
        entityManager.persist(student);

    }

    @Override
    public Student findById(int id) {
       return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery=entityManager.createQuery("from Student where firstName=:theName", Student.class);
        theQuery.setParameter("theName", "Nivi");
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public Student updateStudent(int i) {
    Student student= entityManager.find(Student.class, i);
        student.setEmail("nivishada@gmail.com");
        entityManager.merge(student);
        return student;
    }

    @Override
    @Transactional
    public void updateStudentAll() {
        int theQuery=entityManager.createQuery("update Student set lastName='Shada's'", Student.class).executeUpdate();


    }
}
