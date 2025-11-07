package sathvika532;
//executor class
public class CarMain {

	public static void main(String[] args) {
		//create instance/object
		//classname objectname=new constructor();
		Car c=new Car();
		c.speed=120;
		c.model="honda";
		c.type="petrol";
		c.start();
		Car c1=new Car();
		c1.model="suzuki";
		c1.speed=120;
		c1.type="diesel";

	}

}
