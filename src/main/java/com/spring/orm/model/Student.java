package com.spring.orm.model;

import javax.persistence.*;

@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @Column(name = "id")
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "city")
    private String city;

    private int age;

    public Student() {
    }

    public Student(int id, String studentName, String city, int age) {
        this.studentId = id;
        this.studentName = studentName;
        this.city = city;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
