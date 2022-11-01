package org.example.components.video;

import org.example.components.Component;

public class VideoCard extends Component {
    private String maxResolution;
    private int directX;

    public VideoCard(String name, double price, double mass, String maxResolution, int directX) {
        super(name, price, mass);
        this.maxResolution = maxResolution;
        this.directX = directX;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getMass() {
        return super.getMass();
    }

    @Override
    public void setMass(double mass) {
        super.setMass(mass);
    }

    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }

    public int getDirectX() {
        return directX;
    }

    public void setDirectX(int directX) {
        this.directX = directX;
    }
}
