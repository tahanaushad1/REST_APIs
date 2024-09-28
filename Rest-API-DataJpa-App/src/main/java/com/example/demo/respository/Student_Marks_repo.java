package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student_Marks;
@Repository
public interface Student_Marks_repo extends JpaRepository<Student_Marks, Integer> {

}
