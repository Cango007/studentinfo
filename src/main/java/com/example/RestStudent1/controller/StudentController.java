package com.example.RestStudent1.controller;

import com.example.RestStudent1.entity.Student;
import com.example.RestStudent1.respository.StudentRepo;
import com.example.RestStudent1.service.Service;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
   private Service service;
@PostMapping ()


    public Student saveStudent(@RequestBody Student student)
    {
//        Student student1 = new Student(int);
//
//        student1.setName(name);
//        student1.setQuif("Cricter");
//        System.out.println(student1);
//        Student result = studentRepo.save(student1);
//        return  student1;

        return  service.saveStudent(student);

    }
    @GetMapping ("/findById/id")
    public Student findById(@PathVariable("id") Integer id)
    {
        Student student = new Student();
      Optional<Student> result= Optional.ofNullable(service.findById(id));
      return  result.get();
    }
    @GetMapping("getAllStudents")
    public ResponseEntity<List<Student>>  findAllStudents()
    {
        List<Student> s= service.findAllStudents();
        return  new ResponseEntity<List<Student>>(s, HttpStatus.OK);
    }
    @GetMapping ("findByName/{name}")
    public List<Student> findByName(@PathVariable("name") String name)
    {

     return     service.findByName(name);

    }
    @GetMapping("findByIdBetween/{i}/{j}")
    public List<Student> findByIdBetween(@PathVariable("i") Integer i,@PathVariable("j") Integer j)
    {
        return  service.findByIdBetween(i, j);
    }

    @GetMapping("findByNameLike/{nameLike}")
    public List<Student> findByIdBetween(@PathVariable("nameLike") String nameLike)
    {
        return  studentRepo.findByNameLike("%"+nameLike+"%");
    }






}
