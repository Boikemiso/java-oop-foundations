package com.oop.module3;

/**
 * Exercise 5: Vehicle Base Class
 *
 * TODO: Create a Vehicle base class (alternative inheritance example):
 * 1. Fields:
 *    - brand (String) - manufacturer name
 *    - speed (double) - current speed in km/h
 *
 * 2. Constructor:
 *    - Accepts brand and initial speed
 *
 * 3. Methods:
 *    - getBrand() - returns brand
 *    - getSpeed() - returns speed
 *    - accelerate(double amount) - increases speed
 *    - brake(double amount) - decreases speed but not below 0
 *    - getType() - method intended to be overridden by subclasses
 *    - toString() - includes brand, speed, and type
 *
 * WHY: This exercise teaches you how to:
 * - Design a reusable parent class for different vehicle types
 * - Create overridable methods for subtype-specific identity
 * - Share behavior (accelerate/brake) across subclasses
 */
public class Vehicle {
    // TODO: Add fields here
    String brand;
    double speed;
    String type;
    // TODO: Add constructor here
    public Vehicle(String brand, double speed){
        this.brand = brand;
        this.speed = speed;
    }
    // TODO: Add getter methods here
    public String getBrand(){
        return brand;
    }

    public double getSpeed(){
        return speed;
    }
    // TODO: Add shared behavior methods here
    public void accelerate(double amount){
        if(amount >= 0){
            speed += amount;
        }
    }

    public void brake(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount is less than zero");
        }
        speed -= amount;

        //This is called clamping
        if(speed < 0){
            //set it back to zero
            speed = 0;
        }
    }
    // TODO: Add method designed for overriding (getType)
    public String getType(){
        return type;
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Vehicle{brand='" + brand + "', speed=" + speed + ", type='" + type + "'}";
    }
}
