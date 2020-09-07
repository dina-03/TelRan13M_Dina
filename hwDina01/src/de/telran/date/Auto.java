package de.telran.date;

public class Auto {
   private String autoMake;
   private int year;
   private String bodyColor;
   private String body;
   private String model;
   private int nrOfDoors;
   private String countryVersion;
   private double price;

   public Auto(){};

   public Auto(String autoMake, int year, String bodyColor){
       this.autoMake = autoMake;
       this.year = year;
       this.bodyColor = bodyColor;
   }

    public String getAutoMake() {
        return autoMake;
    }

    public void setAutoMake(String autoMake) {
        this.autoMake = autoMake;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public String getCountryVersion() {
        return countryVersion;
    }

    public void setCountryVersion(String countryVersion) {
        this.countryVersion = countryVersion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto:" +
                "autoMake: " + autoMake +
                ", year: " + year +
                ", bodyColor: " + bodyColor +
                ", body: " + body +
                ", model: " + model +
                ", nrOfDoors: " + nrOfDoors +
                ", countryVersion: " + countryVersion +
                ", price: " + price + " €" +
                '.';
    }
}
