package test_1;

public class BankAccount {
    public String accountHolder;
    
    // TODO: ?
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double getBalance() {
        // TODO: Return the private balance field
        return balance;
    }

    public boolean deposit(double amount) {
        // TODO: Amount must be positive (> 0).
        // Update balance and return true if successful, false otherwise.
        if (amount > 0){
            balance += amount;
            return true;
        }else{
        return false;
        }
    }

    public boolean withdraw(double amount) {
        // TODO: Amount must be positive (> 0) and cannot exceed the current balance.
        // Update balance and return true if successful, false otherwise.
        if (amount > 0 & amount < balance ){
            balance +=amount;
            return true;
        }else{
        return false;
        }
    }
}
