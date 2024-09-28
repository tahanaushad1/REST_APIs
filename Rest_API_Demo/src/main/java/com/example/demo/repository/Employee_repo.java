package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeInfo;
@Repository
public interface Employee_repo extends JpaRepository<EmployeeInfo, Integer> {

}
