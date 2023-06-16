package org.scoop;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product(String itemNo){ this.itemNo = itemNo; }
    public Product(String itemNo, String name){
        this.itemNo = itemNo;
        this.name = name;
    }
    public Product(String itemNo, String name, double price, short qty){
        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }

    public String getItemNo() { return itemNo; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public short  getQty(){ return qty; }

    public void setPrice(double price){ this.price = price; }
    public void setQty(short qty){ this.qty = qty; }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phone;

    public Customer(String custId, String name){
        this.custId = custId;
        this.name = name;
    }

    public Customer(String custId, String name, String address, String phone){
        this.custId = custId;
        this.name = name;
        setAddress(address);
        setPhone(phone);
    }

    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone){ this.phone = phone; }

    public String getCustId(String custId) { return custId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}


public class Demo {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("P001");
        Product product2 = new Product("P002", "Product 2");
        Product product3 = new Product("P003", "Product 3", 9.99, (short) 10);

        // Create Customer objects
        Customer customer1 = new Customer("C001", "Mishra");
        Customer customer2 = new Customer("C002", "Abhishek", "123 Main Street", "+91- 90xxxxxxxx");

        // Access object properties and methods
        System.out.println("Product 1: " + product1.getItemNo());
        System.out.println("Product 2: " + product2.getName());
        System.out.println("Product 3: " + product3.getPrice());
        System.out.println("Customer 1: " + customer1.getName());
        System.out.println("Customer 2: " + customer2.getAddress());
    }
}
