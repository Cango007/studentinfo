package com.example.RestStudent1;

import com.example.RestStudent1.controller.StudentController;
import com.example.RestStudent1.entity.Student;
import com.example.RestStudent1.service.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.get;
import static org.mockito.Mockito.when;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = StudentController.class)
public   class TestStudent {

    public TestStudent() {
    }

    @Autowired
    private MockMvc mvc;

    @MockBean
    private Service service;
@Test
   public void  test1() throws Exception {
       Student std1 = new Student(1,"Dhoni","Cricter");
       Student std2 = new Student(2,"Kholi","Cricter");
       Student std3 = new Student(3,"Sachin","Cricter");
       Student std4 = new Student(4,"Kaif","Cricter");

       List<Student> list = Arrays.asList(std1,std2,std3,std4);

       when(service.findAllStudents()).thenReturn(list);

       mvc.perform(MockMvcRequestBuilders.get("getAllStudents")
               .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.jsonPath("$").exists());
               //andExpect(MockMvcResultMatchers.status().isOk());

   }

}
