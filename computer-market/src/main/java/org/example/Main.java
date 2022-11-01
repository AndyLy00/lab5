package org.example;

import org.example.components.hard.HardDisk;
import org.example.components.motherboards.MotherBoard;
import org.example.components.processors.Processor;
import org.example.components.rams.Ram;
import org.example.components.video.VideoCard;
import org.example.computer.Computer;
import org.example.computer.Laptops;
import org.example.user.User;
import org.example.user.VipUser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HardDisk hardDisk1 = new HardDisk("PCIe M.2 NVMe", 500, 0.2, 256);
        HardDisk hardDisk2 = new HardDisk("Seagate Barracuda", 600, 0.4, 512);
        HardDisk hardDisk3 = new HardDisk("Western Digital Caviar", 550, 0.3, 256);
        MotherBoard motherBoard1 = new MotherBoard("TN+film", 1000, 0.4, 2, "Intel UHD");
        MotherBoard motherBoard2 = new MotherBoard("Biostar Racing", 3000, 0.4, 8, "Intel UHD");
        MotherBoard motherBoard3 = new MotherBoard("Gigabyte", 1640, 0.3, 2, "Intel UHD");
        Processor processor1 = new Processor("Intel Core i3", 1500, 0.1, 2, "Intel");
        Processor processor2 = new Processor("Core i5-10400F", 2400, 0.2, 4, "Intel");
        Processor processor3 = new Processor("Ryzen 5 5500", 3600, 0.3, 6, "AMD");
        Ram ram1 = new Ram("DDR4", 800, 0.2, 2, 8);
        Ram ram2 = new Ram("Fury Beast", 1000, 0.4, 4, 16);
        Ram ram3 = new Ram("Goodram", 660, 0.2, 1, 8);
        VideoCard videoCard1 = new VideoCard("Sapphire Radeon", 1990, 0.3, "4096x2160", 12);
        VideoCard videoCard2 = new VideoCard("GeForce", 3990, 0.5, "7680x4320", 12);
        VideoCard videoCard3 = new VideoCard("Gigabyte GeForce RTX3090 ", 7990, 0.8, "7680x4320", 12);
        Computer computer1 = new Laptops("Laptop Acer Extensa", hardDisk1, motherBoard1, processor1, ram1, videoCard1, "15.6");
        Computer computer2 = new Laptops("Asus VivoBook E410MA", hardDisk1, motherBoard2, processor3, ram1, videoCard2, "14");
        Computer computer3 = new Laptops("Laptop Asus ROG Strix", hardDisk3, motherBoard1, processor2, ram3, videoCard3, "16");
        Computer computer4 = new Laptops("Sistem Desktop Atol PC1122MP", hardDisk1, motherBoard2, processor1, ram2, videoCard1, "16");
        Computer computer5 = new Laptops("Sistem Desktop Zotac Barebone Magnus", hardDisk2, motherBoard3, processor1, ram2, videoCard2, "16");
        Computer computer6 = new Laptops("Sistem Desktop Intel NUC Barebone", hardDisk2, motherBoard2, processor2, ram3, videoCard3, "16");
        List<Computer> computers = new ArrayList<>(List.of(computer1, computer2, computer3, computer4, computer5, computer6));
        Map<Computer, Integer> market = new HashMap<>();
        market.put(computer1, 25);
        market.put(computer2, 34);
        market.put(computer3, 42);
        market.put(computer4, 34);
        market.put(computer5, 18);
        market.put(computer6, 32);
        double totalSum = 0.0;
        int mouth = 1;
        int nrOfUsers;
        int mouthSum = 0;
        String a;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<User> personList = new ArrayList<>(List.of(new User(), new VipUser()));
        System.out.println("Counter Started:");
        boolean b = true;
        for (int i = 1; b; i++) {
            int sum = 0;
            nrOfUsers = random.nextInt(1, 4);
            System.out.println("--------------------");
            System.out.println(i + ". Day Started:");
            for (int j = 0; j < nrOfUsers; j++) {
                Computer computer = computers.get(random.nextInt(computers.size()));
                User person = personList.get(random.nextInt(personList.size()));
                person.setMoney(random.nextInt(5000, 15000));
                person.setComputer(computers.get(random.nextInt(computers.size())));
                if (person.equals(personList.get(0))) {
                    System.out.print("Client with " + person.getMoney() + " want to buy " + computer.getName() + " with price of " + computer.getPrice());
                } else {
                    System.out.print("Vip client with " + person.getMoney() + " want to buy " + computer.getName() + " with price of " + computer.getPrice());
                }
                person.setComputer(computer);
                //Client Buy Something
                if (market.get(computer) > 0) {
                    if (person.getMoney() >= computer.getPrice()) {
                        System.out.println(" and he buy it!");
                        market.put(computer, market.get(computer) - 1);
                        if (person.equals(personList.get(0))) {
                            sum += computer.getPrice();
                        }else {
                            sum += computer.getPrice() * 0.05;
                        }
                    } else {
                        System.out.println(" and he cannot buy it");
                        if (market.entrySet().stream().anyMatch(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice())) {
                            Map.Entry<Computer, Integer> entry = market.entrySet().stream()
                                    .filter(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice())
                                    .findFirst().orElseThrow();
                            if (market.get(entry.getKey()) > 0) {
                                System.out.println("Instead of that he buy " + entry.getKey().getName() + " with price " + entry.getKey().getPrice());
                                market.put(entry.getKey(), market.get(entry.getKey()) - 1);
                                if (person.equals(personList.get(0))) {
                                    sum += entry.getKey().getPrice();
                                }else {
                                    sum += entry.getKey().getPrice() * 0.05;
                                }

                            }
                        }
                    }
                }else {
                    System.out.println("\nBut not in the stock");
                }
            }
            mouthSum += sum;
            System.out.println(i + ". Day sum: " + sum);


            System.out.println("--------------------");
            if (i % 30 == 0) {
                totalSum += mouthSum;
                System.out.println("***************************************");
                System.out.println(mouth + ". Mouth");
                System.out.println("Total money: " + mouthSum);
                System.out.println("Income: " + mouthSum * 0.12);
                mouth++;
                mouthSum = 0;
                market.put(computer1, 25);
                market.put(computer2, 34);
                market.put(computer3, 42);
                market.put(computer4, 34);
                market.put(computer5, 18);
                market.put(computer6, 32);
                System.out.println("***************************************");
                System.out.print("Tap 0 to stop or 1 to continue: ");
                a = scanner.next();
                if (a.equals("0")) {
                    b = false;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("The final report is: ");
                    System.out.println("In " + i + " days we get " + Math.round(totalSum * 1000000000) / 1000000000.0);
                    System.out.println("Income: " + Math.round(totalSum * 0.05 * 1000000000) / 1000000000.0);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
            }
        }
    }
}