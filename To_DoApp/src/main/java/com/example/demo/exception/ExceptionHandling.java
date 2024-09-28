package com.example.demo.exception;

public class ExceptionHandling {
	 void exceptionWithTry() {
		 try {
			int i=10,j=0,k;
			System.out.println("before execution");
			k=i/j;
			System.out.println("After execution");
			System.out.println("Value of k"+k);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		 System.out.println("If exeception occure in  try block then this line is printed..");
	 }
}
