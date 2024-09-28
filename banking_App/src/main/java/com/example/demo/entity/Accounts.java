package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="account_Holder_Name")
	private String accountHolderName;
	@Column(name="balance")
	private double balance;
	

}
