package com.oop.module3;

/**
 * Exercise 3: Cat Subclass
 *
 * TODO: Create a Cat class that extends Animal:
 * 1. Fields:
 *    - indoor (boolean) - true if indoor cat
 *
 * 2. Constructor:
 *    - Accepts name, age, and indoor
 *    - Uses super(name, age)
 *
 * 3. Methods:
 *    - isIndoor() - returns indoor status
 *    - makeSound() - returns a cat sound (e.g., "Meow")
 *    - move() - returns cat movement description
 *    - scratch() - cat-specific behavior
 *    - toString() - includes inherited and cat-specific fields
 *
 * WHY: This exercise teaches you how to:
 * - Specialize inherited models with new properties
 * - Override shared contracts differently in each subclass
 * - Keep shared logic in the parent while customizing behavior
 */
public class Cat extends Animal{
    // TODO: Make this class extend Animal

    // TODO: Add fields here
    boolean indoor;
    // TODO: Add constructor here
    public Cat(){
        super("Zuri", 13);
    }
    public Cat(String name, int age, boolean indoor){
        super(name, age);
        this.indoor = indoor;
    }
    // TODO: Add getter methods here
    public boolean isIndoor(){
        return indoor;
    }

    //Don't need as cat inherits from Animal
//    public String getName(){
//        return super.getName();
//    }
//
//    public int getAge(){
//        return super.getAge();
//    }
    
    // TODO: Override inherited abstract methods here
    @Override
    public String makeSound(){
        return "Meow";
    }

    @Override
    public String move(){
        return "Pounces to the left";
    }
    // TODO: Add Cat-specific methods here
    public String scratch(){
        return "Scratches chairs";
    }
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Cat{name='" + name + "',age=" + age + ",indoor=" + indoor + "}";
    }
}
