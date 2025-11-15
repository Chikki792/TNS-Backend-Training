package com.avn.tns.exceptiondemo;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {
		AgeChecker ob=new AgeChecker();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int ageNum=sc.nextInt();
		try {
			ob.CheckAge(ageNum);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
