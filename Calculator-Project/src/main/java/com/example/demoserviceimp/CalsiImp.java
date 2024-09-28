package com.example.demoserviceimp;

import com.example.demo.services.Calsi;

public class CalsiImp implements Calsi {

	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

}
