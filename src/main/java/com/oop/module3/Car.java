package com.oop.module3;

/**
 * Exercise 6: Car Subclass
 *
 * TODO: Create a Car class that extends Vehicle:
 * 1. Fields:
 *    - numberOfDoors (int)
 *
 * 2. Constructor:
 *    - Accepts brand, speed, and numberOfDoors
 *    - Uses super(brand, speed)
 *
 * 3. Methods:
 *    - getNumberOfDoors() - returns number of doors
 *    - getType() - overridden to return car type
 *    - honk() - car-specific behavior
 *    - toString() - includes vehicle and car-specific data
 *
 * WHY: This exercise teaches you how to:
 * - Override non-abstract parent methods
 * - Add specialization data to a subtype
 * - Combine inherited and custom behavior in one class
 */
public class Car extends Vehicle {
    // TODO: Make this class extend Vehicle

    // TODO: Add fields here
    int numberOfDoors;
    // TODO: Add constructor here
    public Car(String brand, double speed, int numberOfDoors){
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
    // TODO: Add getter methods here
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    // TODO: Override parent methods here
    @Override
    public String getType(){
        return "Car";
    }
    // TODO: Add Car-specific methods here
    public String honk(){
        return "Beep";
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Car{brand='" + brand + "', speed=" + speed + ", number of doors=" + numberOfDoors + "}";
    }
}
