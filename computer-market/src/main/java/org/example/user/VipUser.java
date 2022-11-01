package org.example.user;

import org.example.computer.Computer;

public class VipUser extends User implements Person{
    public VipUser(Computer computer, double money) {
        super(computer, money);
    }

    public VipUser() {
    }

    @Override
    public double buyProduct() {
        return super.buyProduct() * 0.9;
    }
}
