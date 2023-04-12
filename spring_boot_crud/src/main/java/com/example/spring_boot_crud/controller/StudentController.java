package com.example.spring_boot_crud.controller;

import com.example.spring_boot_crud.entity.Student;
import com.example.spring_boot_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/std")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/all")
    public List<Student> getAllStudent(){
            return studentService.getAllStudent();
    }
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student std){
        return studentService.createStudent(std);
    }
    @PutMapping("/update")
    public Student upadateStudent(@RequestBody Student std){
            return studentService.updateStudent(std);
    }

    @PutMapping("/update/id/{student_id}")
    public Student upadateStudent( @PathVariable("student_id") Integer student_id,@RequestBody Student std){

        return studentService.updateStudent(student_id,std);
    }
    @DeleteMapping("/delete/{student_id}")
    public void deleteStudent(@PathVariable("student_id") Integer student_id){
        studentService.deleteStudent(student_id);

    }
    @DeleteMapping("/delete")
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }

}
