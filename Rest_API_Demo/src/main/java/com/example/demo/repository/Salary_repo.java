package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SalaryInfo;
@Repository
public interface Salary_repo extends JpaRepository<SalaryInfo, Integer> {

}
