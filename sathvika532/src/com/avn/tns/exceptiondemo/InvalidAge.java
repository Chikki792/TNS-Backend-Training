package com.avn.tns.exceptiondemo;
//custom exception
public class InvalidAge extends Exception{
	public InvalidAge(String msg) {
		super(msg);
	}

}
