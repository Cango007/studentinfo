package com.example.RestStudent1.service;

import com.example.RestStudent1.entity.Student;
import com.example.RestStudent1.respository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
            private StudentRepo studentRepo;


  public Student saveStudent(Student student)
  {
      studentRepo.save(student);
      return student;
  }


     public Student   findById(Integer id)
     {
  Optional<Student> student=       studentRepo.findById(id);
         return student.get();
     }


public List<Student> findAllStudents()
{
 List<Student> students =   studentRepo.findAll();
    return students;
}


    public List<Student>   findByName(String name)
    {
     List<Student> students=   studentRepo.findByName(name);
        return students;
    }

    public List<Student>    findByIdBetween(Integer i, Integer j)
    {
   List<Student> students=     studentRepo.findByIdBetween(i,j);
        return students;
    }


}
