package de.telran.application;

import de.telran.date.Auto;

public class AutoApplication {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi", 2002, "Black");
        Auto auto2 = new Auto("BMW", 2019, "Grey");
        auto1.setBody("Sedan");
        auto1.setCountryVersion("Germany");
        auto1.setModel("A4");
        auto1.setNrOfDoors(4);
        auto1.setPrice(1000);
        auto2.setNrOfDoors(5);
        auto2.setCountryVersion("Germany");
        auto2.setBody("Off-Road/Pick-up");
        auto2.setModel("80KWH");
        auto2.setPrice(64000);
        System.out.println(auto1);
        System.out.println(auto2);
    }
}
