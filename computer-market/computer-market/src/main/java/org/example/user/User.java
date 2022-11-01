package org.example.user;

import org.example.computer.Computer;

public class User implements Person {
    private Computer computer;
    private double money;

    public User() {
    }

    public User(Computer computer, double money) {
        this.computer = computer;
        this.money = money;
    }



    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public double buyProduct(){
        if (money >= computer.getPrice()){
            return computer.getPrice();
        }
        return 0;
    }
}
