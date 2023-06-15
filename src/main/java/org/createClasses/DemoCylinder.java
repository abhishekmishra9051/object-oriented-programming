package org.createClasses;

public class DemoCylinder {
    private int height;
    private int radius;

    // Constractor
    public DemoCylinder(){
        height = radius = 1;
    }

    public DemoCylinder(int h, int r){
        radius = r;
        height = h;
    }

    // getter and setter
    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        if(h >= 0)
            height = h;
        else
            height = 0;
    }

    public void setRadius(int r){
        if(r >= 0)
            radius = r;
        else
            radius = 0;
    }

    public void setDimensions(int h, int r){
        height = h;
        radius = r;
    }

    // methods
    public double lidArea(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double drumArea(){
        return 2 * lidArea() + perimeter() * height;
    }

    public double volume(){
        return lidArea() * height;
    }

    public static void main(String[] args) {
        DemoCylinder  demoCylinder = new DemoCylinder();
        demoCylinder.setHeight(10);
        demoCylinder.setRadius(5);
        demoCylinder.setDimensions(10, 5);
        System.out.println("LidArea "+demoCylinder.lidArea());
        System.out.println("Circumference " + String.format("%.3f", demoCylinder.perimeter()));
        System.out.println("Total Surface Area " + String.format("%.3f", demoCylinder.drumArea()));
        System.out.printf("Volume " + String.format("%.3f", demoCylinder.volume()));
//        System.out.printf("Circumference %.3f\n", demoCylinder.perimeter());
//        System.out.printf("Total Surface Area %.3f\n", demoCylinder.drumArea());
//        System.out.printf("Volume %.3f\n", demoCylinder.volume());
        System.out.println("Heigh t"+demoCylinder.getHeight());
        System.out.println("Radius "+demoCylinder.getRadius());
    }
}


