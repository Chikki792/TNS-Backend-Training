package sathvika532;

public class ATMImpl implements ATM {
    double balance = 1000; // starting balance

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        if (amount <= DEPOSIT_LIMIT) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Deposit exceeds the limit of " + DEPOSIT_LIMIT);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (amount > balance - MIN_BAL) {
            System.out.println("Insufficient funds! Minimum balance of " + MIN_BAL + " must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        }
    }
}
