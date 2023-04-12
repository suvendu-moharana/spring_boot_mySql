package com.example.spring_boot_crud.impl;

import com.example.spring_boot_crud.entity.Student;
import com.example.spring_boot_crud.repository.StudentRepository;
import com.example.spring_boot_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student createStudent(Student std) {
        return studentRepository.save(std);
    }

    @Override
    public Student getStudentById(Integer student_id) {
        Optional<Student> optionalStd=studentRepository.findById(student_id);

        return optionalStd.get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student std) {
            Student s=studentRepository.findById(std.getStudent_id()).get();
            s.setStudentName(std.getStudentName());
            s.setAddress(std.getAddress());
            s.setMark(std.getMark());
        return studentRepository.save(s);
    }

    @Override
    public Student updateStudent(Integer sId, Student studentInput) {
        Student s=studentRepository.findById(sId).get();
        s.setStudentName(studentInput.getStudentName());
        s.setAddress(studentInput.getAddress());
        s.setMark(studentInput.getMark());
        return studentRepository.save(s);
    }

    @Override
    public void deleteStudent(Integer student_id) {
        studentRepository.deleteById(student_id);

    }

    @Override
    public void deleteStudent(Student std) {
        studentRepository.deleteById(std.getStudent_id());
    }
}
