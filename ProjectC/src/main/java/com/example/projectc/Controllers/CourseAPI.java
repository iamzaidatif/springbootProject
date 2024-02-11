package com.example.projectc.Controllers;

import com.example.projectc.Entities.Course;
import com.example.projectc.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseAPI {
    @Autowired
    CourseService courseService;
    @PostMapping("/add-course")
    public Course addCourse(@RequestParam int id,@RequestParam String name){
        return courseService.addCourse(id, name);
    }
}
