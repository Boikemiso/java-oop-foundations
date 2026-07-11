package com.oop.module3;

/**
 * Exercise 7: Truck Subclass
 *
 * TODO: Create a Truck class that extends Vehicle:
 * 1. Fields:
 *    - payloadCapacity (double) - max load in tons
 *
 * 2. Constructor:
 *    - Accepts brand, speed, and payloadCapacity
 *    - Uses super(brand, speed)
 *
 * 3. Methods:
 *    - getPayloadCapacity() - returns payload capacity
 *    - getType() - overridden to return truck type
 *    - loadCargo(double weight) - truck-specific behavior
 *    - toString() - includes vehicle and truck-specific data
 *
 * WHY: This exercise teaches you how to:
 * - Build a second subtype from the same parent class
 * - Model subtype-specific constraints and responsibilities
 * - Compare sibling subclasses (Car vs Truck) in one hierarchy
 */
public class Truck extends Vehicle{
    // TODO: Make this class extend Vehicle

    // TODO: Add fields here
    double payloadCapacity;
    double currentLoad;
    // TODO: Add constructor here
    public Truck(String brand, double speed, double payloadCapacity){
        super(brand, speed);
        this.payloadCapacity = payloadCapacity;
        this.currentLoad = 0;
    }
    // TODO: Add getter methods here
    public double getPayloadCapacity(){
        return payloadCapacity;
    }

    public double getCurrentLoad(){
        return currentLoad;
    }
    // TODO: Override parent methods here
    @Override
    public String getType(){
        return "Truck";
    }
    // TODO: Add Truck-specific methods here
    public void loadCargo(double weight){
        if(weight < 0){
            throw new IllegalArgumentException("Weight cannot be less than zero");
        }
        if(currentLoad + weight > payloadCapacity){
            throw new IllegalArgumentException("Exceeds payload capacity");
        }
        currentLoad += weight;
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Truck{brand='" + brand + "', speed=" + speed + ", payload capacity=" + payloadCapacity +"}";
    }
}
