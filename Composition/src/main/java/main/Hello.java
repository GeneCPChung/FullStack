package main;

import components.GraphicsCard;
import components.Processor;
import laptop.Laptop;

public class Hello {
    public static void main(String[] args) {
        // Laptop lappy = new Laptop();
        // System.out.println(lappy.getProcessor().getBrand());

        Processor processor = new Processor("intel", "7200U", 7, 4,4,
                "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");

        Laptop gamingLaptop = new Laptop(17, processor, "DDR4", "2TB",
                graphicsCard, null, "backlit");
        System.out.println(gamingLaptop);
        gamingLaptop.gamingMode();
        System.out.println("Gaming mod on");
        System.out.println("Current frequency " + gamingLaptop.getProcessor().getFrequency());
    }
}
