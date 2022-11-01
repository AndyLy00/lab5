package org.example.components;

public class Component {
    private String name;
    private double price;
    private double mass;

    public Component(String name, double price, double mass) {
        this.name = name;
        this.price = price;
        this.mass = mass;
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

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
