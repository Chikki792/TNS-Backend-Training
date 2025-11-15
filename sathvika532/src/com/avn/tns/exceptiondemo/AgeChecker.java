package com.avn.tns.exceptiondemo;
//driver class
public class AgeChecker {
	public void CheckAge(int age) throws InvalidAge {
		if(age<=18) {
			throw new InvalidAge("this person is  not eligible to apply");
		}
		else {
			System.out.println("you are eligible to register");
		}
	}

}
