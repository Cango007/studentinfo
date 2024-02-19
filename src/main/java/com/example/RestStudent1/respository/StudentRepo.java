package com.example.RestStudent1.respository;

import com.example.RestStudent1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

public    List<Student>  findByName(String name);

    List<Student> findByIdBetween(Integer i,Integer j);
 List<Student> findByNameLike(String nameLike);
}
