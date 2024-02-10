package com.example.RestStudent1.controller;

import com.example.RestStudent1.entity.Student;
import com.example.RestStudent1.respository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

@RequestMapping("student")
    public Student saveStudent(Student student)
    {
//        Student student1 = new Student(int);
//
//        student1.setName(name);
//        student1.setQuif("Cricter");
//        System.out.println(student1);
//        Student result = studentRepo.save(student1);
//        return  student1;
        return  studentRepo.save(student);

    }


}
