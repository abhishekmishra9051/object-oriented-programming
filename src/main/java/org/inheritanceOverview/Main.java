package org.inheritanceOverview;

class Member {
    protected String name;
    protected String address;
    protected String phoneNumber;

    public Member(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class Customer extends Member {
    private int customerId;

    public Customer(String name, String address, String phoneNumber, int customerId) {
        super(name, address, phoneNumber);
        this.customerId = customerId;
    }

    public void displayDetails() {
        System.out.println("Customer Details:");
        super.displayDetails();
        System.out.println("Customer ID: " + customerId);
    }

    public void makePurchase(double amount) {
        System.out.println("Customer " + name + " made a purchase of Rs. " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Member object
        Member member = new Member("Abhishek ", "Mohali", "905128xxxx");
        member.displayDetails();
        System.out.println();

        // Creating a Customer object
        Customer customer = new Customer("Abhishek Mishra", "Mohali", "905128xxxx", 123);
        customer.displayDetails();
        customer.makePurchase(50.0);
    }
}

