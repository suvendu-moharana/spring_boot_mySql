package com.example.spring_boot_crud.repository;

import com.example.spring_boot_crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
