package sathvika532;
//demo for types of variables
//instance,local,static
public class Student {
	//instance variables
	int rollno;
	String sname;
	String branch;
	//static variables
	static String collegename="AVNIET";
	//METHOD
	void print() {
		//local variable
		String msg="These are TNS students";
		System.out.println(msg);
		System.out.println("The student details are "+rollno+" "+sname+" "+branch+" "+collegename);
	}
	

}
