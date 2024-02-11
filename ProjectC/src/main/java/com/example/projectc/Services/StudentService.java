package com.example.projectc.Services;
import com.example.projectc.Entities.Course;
import com.example.projectc.Entities.Student;
import com.example.projectc.Repos.CourseRepo;
import com.example.projectc.Repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CourseRepo courseRepo;
    public List<Student>returnStudents(){
//        return studentList;
        return studentRepo.findAll();
//        List<Student>students = new ArrayList<>();
//        studentRepo.findAll().forEach(students::add);
//        return students;
    }
    public Student returnStudent(int id){
        return studentRepo.findById(id).orElseThrow(()->new IllegalArgumentException("ID not present in database."));
    }
    public Student addStudent(Student student){
//        studentList.add(student);
        studentRepo.save(student);
        return student;
    }
    public Student updateStudent(int id, String name){
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId() == id){
//                studentList.set(i, student);
//                break;
//            }
//        }
        Student obj = studentRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Id not found!"));
        obj.setName(name);
        studentRepo.save(obj);
        return obj;
    }
    public void deleteStudent(int id){
        studentRepo.delete(studentRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Id not found!")));
    }
    public Student addCourseToStudent(int Cid, int Sid){
        Student student = studentRepo.findById(Sid).orElseThrow(()->new IllegalArgumentException("ID not present in database."));
        Course course = courseRepo.findById(Cid).orElseThrow(()->new IllegalArgumentException("Course Id not found"));
        List<Course> courses = student.getCourse();
        courses.add(course);
        student.setCourse(courses);
        studentRepo.save(student);
        return student;
    }
}


