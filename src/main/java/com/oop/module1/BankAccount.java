package com.oop.module1;

/**
 * Exercise 2: BankAccount Class
 *
 * TODO: Create a BankAccount class with the following requirements:
 * 1. Fields:
 *    - accountNumber (String)
 *    - balance (double)
 *    - owner (String)
 *
 * 2. Constructor:
 *    - A constructor that accepts accountNumber, owner, and initialBalance
 *    - Should initialize all three fields
 *
 * 3. Methods:
 *    - getBalance() - returns the current balance
 *    - getAccountNumber() - returns the account number
 *    - getOwner() - returns the owner name
 *    - deposit(double amount) - adds amount to balance, throws IllegalArgumentException if amount <= 0
 *    - withdraw(double amount) - subtracts amount from balance, throws IllegalArgumentException if amount <= 0 or amount > balance
 *    - toString() - returns a String representation like "BankAccount{accountNumber='123456', owner='John', balance=1500.0}"
 *
 * WHY: This exercise teaches you how to:
 * - Create methods that modify object state
 * - Use methods to perform operations
 * - Validate inputs in methods
 * - Maintain invariants (balance should never be negative)
 */
public class BankAccount {
    // TODO: Add fields here
    String accountNumber;
    double balance;
    String owner;
    // TODO: Add constructor here
    public BankAccount(String accountNumber,String Owner,double initialBalance){
        this.accountNumber = accountNumber;
        this.owner = Owner;
        this.balance = initialBalance;
    }
    // TODO: Add getter methods here
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }
    // TODO: Add deposit method here
    public void deposit(double amount){
        if(amount <= 0){
           throw new IllegalArgumentException("Amount cannot be less than zero");
    }
        balance += amount;
    }
    // TODO: Add withdraw method here
    public void withdraw(double amount){
        if(amount <= 0 || amount > balance){
            throw new IllegalArgumentException("Amount cannot be less than zero or greater than balance");
        }
        balance -= amount;
    }
    
    // TODO: Override toString() here
    @Override
    public String toString(){
        return accountNumber + owner + balance;
    }
}
