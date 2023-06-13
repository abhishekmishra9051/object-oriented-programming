package org.createClasses;

import org.createClasses.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Account
        List<Account> accountList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of accounts to create: ");
        double numAccounts = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<numAccounts; i++){
            System.out.println("Enter details for Account " + (i + 1) + ":");

            System.out.print("Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Account Holder: ");
            String accountHolder = scanner.nextLine();

            Account account = new Account(accountNumber, initialBalance, accountHolder);
            accountList.add(account);

            System.out.println("Account created successfully!\n");
        }
        for (Account account : accountList) {
            System.out.println("Account Holder: " + account.getAccountNumber());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Balance: Rs " + account.getBalance());
            System.out.println();
        }

        scanner.close();

//        Account account = new Account("AB99991001", 1000.0, "Abhishek Mishra");
//        Account account1 = new Account("AB99991002", 10000.0, "Ayush Mishra");
//        Account account2 = new Account("AB99991003", 100000.0, "Rajesh Mishra");
//        Account account3 = new Account("AB99991004", 100000.0, "Rahul Mishra");
//        Account account4 = new Account("AB99991005", 100.0, "Raj");

//        account.deposit(50.0);
//        account.withdraw(1050.0);
//        double balance = account.getBalance();
//        System.out.println("Current Balance: Rs " + balance);
//        account.displayAccountInfo();

        // STUDENT
        Student student = new Student("Abhishek", 20, "123456", "Computer Science");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Major: " + student.getMajor());

        student.displayStudentInfo();

        // Modifying student information using setters
        student.setName("RAJ");
        student.setAge(21);
        student.setMajor("Electrical Engineering");

        student.displayStudentInfo();
    }
}