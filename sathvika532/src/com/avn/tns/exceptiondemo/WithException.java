package com.avn.tns.exceptiondemo;

public class WithException {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,ArithmeticException {
		try {
			int a=10;
			int b=5;
			int divide=a/b;
			System.out.println("the result is "+divide);
			int arr[]=new int[3];
			arr[0]=12;
			arr[1]=23;
			arr[2]=45;
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the defined index is not existing");
		}
		finally {
			System.out.println("thanks for visiting");
		}
	}

}
