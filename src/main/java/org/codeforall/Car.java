package org.codeforall;

public class Car {

    private int id;
    private String brand;
    private String model;
    private int year;
    private int power;
    private double price;
    private String link;

    private String desc;


    public Car(int id, String brand, String model, int year, int power, double price, String link, String desc) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
        this.price = price;
        this.link = link;
        this.desc = desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
