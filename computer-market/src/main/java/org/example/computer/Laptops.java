package org.example.computer;

import org.example.components.hard.HardDisk;
import org.example.components.motherboards.MotherBoard;
import org.example.components.processors.Processor;
import org.example.components.rams.Ram;
import org.example.components.video.VideoCard;

public class Laptops extends  Computer{
    private String screen;

    public Laptops(String name, HardDisk hardDisk, MotherBoard motherBoard, Processor processor, Ram ram, VideoCard videoCard, String screen) {
        super(name, hardDisk, motherBoard, processor, ram, videoCard);
        this.screen = screen;
    }

    @Override
    public double getMass() {
        return super.getMass();
    }

    @Override
    public HardDisk getHardDisk() {
        return super.getHardDisk();
    }

    @Override
    public void setHardDisk(HardDisk hardDisk) {
        super.setHardDisk(hardDisk);
    }

    @Override
    public MotherBoard getMotherBoard() {
        return super.getMotherBoard();
    }

    @Override
    public void setMotherBoard(MotherBoard motherBoard) {
        super.setMotherBoard(motherBoard);
    }

    @Override
    public Processor getProcessor() {
        return super.getProcessor();
    }

    @Override
    public void setProcessor(Processor processor) {
        super.setProcessor(processor);
    }

    @Override
    public Ram getRam() {
        return super.getRam();
    }

    @Override
    public void setRam(Ram ram) {
        super.setRam(ram);
    }

    @Override
    public VideoCard getVideoCard() {
        return super.getVideoCard();
    }

    @Override
    public void setVideoCard(VideoCard videoCard) {
        super.setVideoCard(videoCard);
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
}
