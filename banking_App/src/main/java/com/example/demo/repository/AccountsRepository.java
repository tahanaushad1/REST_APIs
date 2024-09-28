package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

}
