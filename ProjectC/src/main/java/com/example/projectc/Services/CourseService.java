package com.example.projectc.Services;

import com.example.projectc.Entities.Course;
import com.example.projectc.Entities.Student;
import com.example.projectc.Repos.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public Course addCourse(int id, String name){
        Course course = new Course(id, name);
        courseRepo.save(course);
        return course;
    }
}
