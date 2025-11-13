package com.avn.tns.accessdemo;

public class AccessMain {

	public static void main(String[] args) {
		 // Creating object
        AccessDemo ob = new AccessDemo();

        // Accessing public and default members directly
        ob.name = "sathvika";
        ob.address = "Hyderabad";
        ob.branch = "CSE";

        // Accessing private variable through getter & setter
        ob.setContactno(964087406);

        // Display the values
        ob.display();

        // Or print individually
        System.out.println("Contact number (via getter): " + ob.getContactno());
		
	}

}
