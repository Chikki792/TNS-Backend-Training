package sathvika532;

// Demo for interface
// combo of abstract + (from v1.8) + static + default methods
public interface ATM {
    // abstract methods
    void deposit(int amount);
    void withdraw(int amount);

    // final / constant variables
    double DEPOSIT_LIMIT = 25000;
    double MIN_BAL = 1000;

    // default method
    default void greet() {
        System.out.println("Welcome customer, have a nice day!");
    }

    // static method
    static void info() {
        System.out.println("Cannot print receipt");
    }
}
