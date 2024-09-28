package com.example.demo.serviceimp;

import org.springframework.stereotype.Service;

import com.example.demo.service.Calsi;
@Service
public class CalsiImp implements Calsi {

	@Override
	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}


}
