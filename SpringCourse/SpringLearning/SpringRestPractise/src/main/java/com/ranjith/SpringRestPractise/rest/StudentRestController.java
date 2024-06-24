package com.ranjith.SpringRestPractise.rest;

import com.ranjith.SpringRestPractise.pojo.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents=new ArrayList<>();
        theStudents.add(new Student("Ranjith", "Shada"));
        theStudents.add(new Student("Rachana", "Katakam"));
        theStudents.add(new Student("Nivedha", "Shada"));
        theStudents.add(new Student("Phani", "Katakam"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if(studentId > theStudents.size() || studentId < 0){
            throw new StudentNotFoundException("Student Not Found for Student Id "+studentId);
        }

        return theStudents.get(studentId);
    }


}
