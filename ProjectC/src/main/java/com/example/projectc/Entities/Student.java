package com.example.projectc.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private int semester;
    private String field;
    private String rollNo;
    @ManyToMany
    private List<Course> course = new ArrayList<>();

    public Student(int id, String name, int age, int semester, String field, String rollNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.field = field;
        this.rollNo = rollNo;
    }


    public Student() {

    }
    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", semester=" + semester +
                ", field='" + field + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}



