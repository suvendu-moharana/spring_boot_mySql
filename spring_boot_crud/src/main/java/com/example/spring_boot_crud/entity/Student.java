package com.example.spring_boot_crud.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Integer student_id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "MARK")
    private Double mark;
    @Column(name = "STUDENT_NAME")
    private String studentName;
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int student_id) {
        this.student_id = student_id;
    }

    public Student() {
    }
}
