package org.example.components.motherboards;

import org.example.components.Component;

public class MotherBoard extends Component {
    private int memorySlots;
    private String videoChips;

    public MotherBoard(String name, double price, double mass, int memorySlots, String videoChips) {
        super(name, price, mass);
        this.memorySlots = memorySlots;
        this.videoChips = videoChips;
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

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public String getVideoChips() {
        return videoChips;
    }

    public void setVideoChips(String videoChips) {
        this.videoChips = videoChips;
    }
}
