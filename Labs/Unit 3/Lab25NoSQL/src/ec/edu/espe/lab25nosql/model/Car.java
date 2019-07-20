/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab25nosql.model;

/**
 *
 * @author Jhony NAranjo
 */
public class Car {
    private String color;
    private Double mileage;
    private String brand;
    private String model;
    private String type;

    public Car(String color, Double mileage, String brand, String model, String type) {
        this.color = color;
        this.mileage = mileage;
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 
}
