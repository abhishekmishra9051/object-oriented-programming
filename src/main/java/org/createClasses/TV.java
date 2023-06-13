package org.createClasses;

public class TV {
    private String brand;
    private int size;
    private boolean isOn;

    public TV(String brand, int size) {
        this.brand = brand;
        this.size = size;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is turned on.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is turned off.");
        }
    }

    public void changeChannel(int channel) {
        if (isOn) {
            System.out.println("Changing to channel " + channel);
        }
    }

    public void adjustVolume(int volume) {
        if (isOn) {
            System.out.println("Adjusting volume to " + volume);
        }
    }
}

