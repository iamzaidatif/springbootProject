package com.example.projectc.Controllers;
import com.example.projectc.Entities.Student;
import com.example.projectc.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class StudentControllers {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentService.returnStudents();
    }
//    @GetMapping("/test")
//    public ModelAndView hello(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("hello");
//        return mv;
//    }
    @GetMapping("/persons/{id}")
    Student getStudent(@PathVariable int id){
        return studentService.returnStudent(id);
    }
    @PostMapping("/person/add")
    Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/person/update/{id}")
    Student updateStudent(@PathVariable int id, @RequestParam String name){
        return studentService.updateStudent(id, name);
    }
    @DeleteMapping("/{id}")
    String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Job done!";
    }
    @PutMapping("/add-course-to-student")
    public Student addCourseToStudent(@RequestParam int Cid,@RequestParam int Sid){
        return studentService.addCourseToStudent(Cid, Sid);
    }
}


