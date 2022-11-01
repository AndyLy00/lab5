package org.example.computer;

import org.example.components.hard.HardDisk;
import org.example.components.motherboards.MotherBoard;
import org.example.components.processors.Processor;
import org.example.components.rams.Ram;
import org.example.components.video.VideoCard;

public abstract class Computer {
    private String name;
    private final double price;
    private final double mass;
    private HardDisk hardDisk;
    private MotherBoard motherBoard;
    private Processor processor;
    private Ram ram;
    private VideoCard videoCard;

    public Computer(String name, HardDisk hardDisk, MotherBoard motherBoard, Processor processor, Ram ram, VideoCard videoCard) {
        this.name = name;
        this.price = hardDisk.getPrice() + motherBoard.getPrice() + processor.getPrice() + ram.getPrice() + videoCard.getPrice();
        this.mass = hardDisk.getMass() + motherBoard.getMass() + processor.getMass() + ram.getMass() + videoCard.getMass();
        this.hardDisk = hardDisk;
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public double getMass() {
        return mass;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
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
}
