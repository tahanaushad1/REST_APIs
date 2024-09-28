package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student_dlts;
@Repository
public interface Student_dlts_repo extends JpaRepository<Student_dlts, Integer> {

}
