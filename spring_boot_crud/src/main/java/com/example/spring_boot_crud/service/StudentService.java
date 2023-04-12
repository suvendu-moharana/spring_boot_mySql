package com.example.spring_boot_crud.service;

import com.example.spring_boot_crud.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student std);
    Student getStudentById(Integer student_id);
    List<Student> getAllStudent();
    Student updateStudent(Student std);
    Student updateStudent(Integer sId,Student student);
    void deleteStudent(Integer student_id);
    void deleteStudent(Student std);
}
