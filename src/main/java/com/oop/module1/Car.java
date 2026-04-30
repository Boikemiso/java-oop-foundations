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
    
    // TODO: Add constructor here
    
    // TODO: Add getter methods here
    
    // TODO: Add drive method here
    
    // TODO: Add refuel method here
    
    // TODO: Override toString() here
}
