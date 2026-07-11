package com.oop.module3;

/**
 * Exercise 2: Dog Subclass
 *
 * TODO: Create a Dog class that extends Animal:
 * 1. Fields:
 *    - breed (String) - e.g., "Labrador"
 *
 * 2. Constructor:
 *    - Accepts name, age, and breed
 *    - Uses super(name, age) for parent initialization
 *
 * 3. Methods:
 *    - getBreed() - returns the breed
 *    - makeSound() - returns a dog sound (e.g., "Woof")
 *    - move() - returns dog movement description
 *    - fetch() - dog-specific behavior
 *    - toString() - includes parent data and breed
 *
 * WHY: This exercise teaches you how to:
 * - Extend a base class and reuse parent state
 * - Override abstract methods with subclass-specific behavior
 * - Add subclass-only behavior while preserving parent contract
 */
public class Dog extends Animal {
    // TODO: Make this class extend Animal

    // TODO: Add fields here
    String breed;
    int zero;
    // TODO: Add constructor here
    public Dog(){
        super("", 0);
    }
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    // TODO: Add getter methods here
    public String getBreed(){
        return breed;
    }


    //Don't need as dog inherits from Animal
//    public String getName(){
//        return super.getName();
//    }
//
//    public int getAge(){
//        return super.getAge();
//    }


    // TODO: Override inherited abstract methods here
    public String makeSound(){
        return "Woof";
    }

    public String move(){
        return "Runs forward";
    }

    // TODO: Add Dog-specific methods here
    public String fetch(){
        return "Runs for dog treat";
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Dog{name='" + name + "',age=" + age + ",breed='" + breed + "'}";
    }
}
