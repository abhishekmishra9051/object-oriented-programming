package org.inheritanceOverview;

class CellPhone {
    private String brand;
    private String model;
    private String color;

    public CellPhone(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Making a call to " + phoneNumber);
    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending a message to " + phoneNumber + ": " + message);
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

class Smartphone extends CellPhone {
    private boolean hasInternet;

    public Smartphone(String brand, String model, String color, boolean hasInternet) {
        super(brand, model, color);
        this.hasInternet = hasInternet;
    }

    public void browseInternet(String url) {
        if (hasInternet) {
            System.out.println("Browsing the internet: " + url);
        } else {
            System.out.println("This smartphone does not have internet connectivity.");
        }
    }
}

public class CellPhoneDemo {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("Nothing ", " Nothing1", "White");
        cellPhone.displayDetails();
        cellPhone.makeCall("123456789");
        cellPhone.sendMessage("123456789", "Hello!");

        System.out.println();

        Smartphone smartphone = new Smartphone("Apple", "iPhone 14 pro max", "Silver", true);
        smartphone.displayDetails();
        smartphone.makeCall("987654321");
        smartphone.sendMessage("987654321", "Hi there!");
        smartphone.browseInternet("https://www.linkedin.com/in/abhishekmishra9051");
    }
}

