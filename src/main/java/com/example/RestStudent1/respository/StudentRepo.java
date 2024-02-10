package com.example.RestStudent1.respository;

import com.example.RestStudent1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
