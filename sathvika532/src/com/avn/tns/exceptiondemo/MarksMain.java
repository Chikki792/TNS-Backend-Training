package com.avn.tns.exceptiondemo;

import java.util.Scanner;

//executor class
public class MarksMain {

	public static void main(String[] args) {
		MarksChecker ob=new MarksChecker();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marksNum=sc.nextInt();
		try {
			ob.CheckMarks(marksNum);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
