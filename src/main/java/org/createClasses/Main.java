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

        // Circle
        Circle circle = new Circle(5.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7.5);

        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.getArea());
        System.out.println("Updated Circumference: " + circle.getCircumference());

        //Cylinder
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());

        cylinder.setRadius(7.5);
        cylinder.setHeight(12.0);

        System.out.println("Updated Radius: " + cylinder.getRadius());
        System.out.println("Updated Height: " + cylinder.getHeight());
        System.out.println("Updated Volume: " + cylinder.getVolume());
        System.out.println("Updated Surface Area: " + cylinder.getSurfaceArea());

        // Rectangle
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        rectangle.setLength(7.5);
        rectangle.setWidth(12.0);

        System.out.println("Updated Length: " + rectangle.getLength());
        System.out.println("Updated Width: " + rectangle.getWidth());
        System.out.println("Updated Area: " + rectangle.getArea());
        System.out.println("Updated Perimeter: " + rectangle.getPerimeter());

        //Car
        Car car = new Car("Tata", "Tiago", 2022, "Red");

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());

        car.start();
        car.accelerate();
        car.brake();

        car.setColor("Blue");
        System.out.println("Updated Color: " + car.getColor());

        //TV
        TV tv = new TV("Samsung", 55);

        System.out.println("Brand: " + tv.getBrand());
        System.out.println("Size: " + tv.getSize());
        System.out.println("Is On: " + tv.isOn());

        tv.turnOn();
        tv.changeChannel(5);
        tv.adjustVolume(10);

        tv.turnOff();
    }
}