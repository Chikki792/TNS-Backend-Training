package sathvika532;

public class ATMMain {
    public static void main(String[] args) {
        ATM ob = new ATMImpl();
        ob.greet();           // default method
        ATM.info();           // static method
        ob.deposit(23000);    // deposit within limit
        ob.withdraw(5000);    // withdraw safely
    }
}
