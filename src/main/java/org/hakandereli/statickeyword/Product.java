package org.hakandereli.statickeyword;

public class Product {
    int id;
    String name;
    double price;
    public static int count = 0;

    //static constructor 1

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
