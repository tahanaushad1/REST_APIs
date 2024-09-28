package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student_subject;
@Repository
public interface Student_subject_repo extends JpaRepository<Student_subject, Integer> {

}
