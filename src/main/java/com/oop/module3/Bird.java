package com.oop.module3;

/**
 * Exercise 4: Bird Subclass
 *
 * TODO: Create a Bird class that extends Animal:
 * 1. Fields:
 *    - wingspan (double) - wingspan in meters
 *
 * 2. Constructor:
 *    - Accepts name, age, and wingspan
 *    - Uses super(name, age)
 *
 * 3. Methods:
 *    - getWingspan() - returns the wingspan
 *    - makeSound() - returns a bird sound (e.g., "Chirp")
 *    - move() - returns bird movement description
 *    - fly() - bird-specific behavior
 *    - toString() - includes inherited and bird-specific fields
 *
 * WHY: This exercise teaches you how to:
 * - Build multiple subclasses from one abstract parent
 * - Represent real-world differences using method overriding
 * - Preserve a consistent API while adding unique subtype actions
 */
public class Bird extends Animal{
    // TODO: Make this class extend Animal

    // TODO: Add fields here
    double wingspan;

    // TODO: Add constructor here
    public Bird(){
        super("Zeus", 3);
    }
    public Bird(String name, int age, double wingspan){
        super(name, age);
        this.wingspan = wingspan;
    }
    // TODO: Add getter methods here


    //Don't need as bird inherits from Animal
//    public String getName(){
//        return super.getName();
//    }
//
//    public int getAge(){
//        return super.getAge();
//    }

    public double getWingspan() {
        return wingspan;
    }

    // TODO: Override inherited abstract methods here
    @Override
    public String makeSound(){
        return "Chirp";
    }
    @Override
    public String move(){
        return "Fly up";
    }
    // TODO: Add Bird-specific methods here
    public String fly(){
        return "Fly";
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Bird{name='" + name + "', age=" + age + ", wingspan=" + wingspan + "}";
    }
}
