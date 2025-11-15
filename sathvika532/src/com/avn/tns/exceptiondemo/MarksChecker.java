package com.avn.tns.exceptiondemo;
//driver class
public class MarksChecker {
	public void CheckMarks(int marks) throws InvalidMarks {
		if(marks<0 && marks>100) {
			throw new InvalidMarks("the marks of a student is invalid" );
		}
		else {
			System.out.println("the marks are valid");
		}
	}

}