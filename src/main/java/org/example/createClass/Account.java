package org.example.createClass;

public class Account {
    private String accountNumber;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String ownerName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
