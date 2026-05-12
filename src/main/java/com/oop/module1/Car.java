package com.oop.module1;

/**
 * Exercise 3: Car Class
 *
 * TODO: Create a Car class with the following requirements:
 * 1. Fields:
 *    - make (String) - e.g., "Toyota"
 *    - model (String) - e.g., "Camry"
 *    - fuelTankCapacity (double) - total fuel capacity in liters
 *    - currentFuel (double) - current fuel in tank
 *    - distanceTraveled (double) - total distance traveled in kilometers
 *
 * 2. Constructor:
 *    - A constructor that accepts make, model, and fuelTankCapacity
 *    - Should initialize currentFuel to fuelTankCapacity (full tank)
 *    - Should initialize distanceTraveled to 0
 *
 * 3. Methods:
 *    - getMake() - returns the make
 *    - getModel() - returns the model
 *    - getCurrentFuel() - returns current fuel
 *    - getDistanceTraveled() - returns total distance traveled
 *    - drive(double distance) - drives the car by the specified distance
 *      * Should decrease currentFuel by distance * 0.1 (consumes 0.1L per km)
 *      * Should increase distanceTraveled by distance
 *      * Should throw IllegalArgumentException if distance <= 0
 *      * Should throw IllegalStateException if not enough fuel to drive that distance
 *    - refuel() - fills the tank back to capacity
 *    - toString() - returns "Car{make='Toyota', model='Camry', currentFuel=50.0, distanceTraveled=100.0}"
 *
 * WHY: This exercise teaches you how to:
 * - Maintain state across multiple method calls
 * - Accumulate values over time (distanceTraveled)
 * - Validate state before operations (check fuel before driving)
 * - Enforce invariants (fuel should never exceed capacity)
 */
public class Car {
    // TODO: Add fields here
    String make;
    String model;
    double fuelTankCapacity;
    double currentFuel;
    double distanceTravelled;
    // TODO: Add constructor here
    public Car(String make, String model, double currentFuel){
        //Bubble sort is about scapegoats
        this.fuelTankCapacity = currentFuel;
        this.distanceTravelled =  0;
        this.make = make;
        this.model = model;
        this.currentFuel = fuelTankCapacity;
    }
    // TODO: Add getter methods here
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public double getCurrentFuel(){
        return currentFuel;
    }

    public double getDistanceTraveled() {
        return distanceTravelled;
    }
    // TODO: Add drive method here
    public void drive(double distance){
        if(distance <= 0){
            throw new IllegalArgumentException("");
        }
        double fuelConsumed = distance * 0.1;
        if(currentFuel < fuelConsumed){
            throw new IllegalStateException("Not enough fuel to drive the distance");
        }
        currentFuel -= fuelConsumed;
        distanceTravelled += distance;
    }
    // TODO: Add refuel method here
    public void refuel(){
        currentFuel = fuelTankCapacity;
    }
    
    // TODO: Override toString() here
    public String toString(){
        return make + model + currentFuel + distanceTravelled;
    }
}
