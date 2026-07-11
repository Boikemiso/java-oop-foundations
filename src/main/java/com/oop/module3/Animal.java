package com.oop.module3;

/**
 * Exercise 1: Animal Base Class
 *
 * TODO: Create an abstract Animal class with the following requirements:
 * 1. Fields:
 *    - name (String) - the animal's name
 *    - age (int) - the animal's age in years
 *
 * 2. Constructor:
 *    - A constructor that accepts name and age
 *    - Should initialize both fields
 *
 * 3. Methods:
 *    - getName() - returns the name
 *    - getAge() - returns the age
 *    - makeSound() - abstract method, each animal sounds different
 *    - move() - abstract method, each animal moves differently
 *    - toString() - returns "Animal{name='Nala', age=3}"
 *
 * WHY: This exercise teaches you how to:
 * - Model common behavior in a parent class
 * - Use abstract classes to define contracts for subclasses
 * - Avoid duplication by sharing reusable state and methods
 */
public abstract class Animal {
    // TODO: Add fields here
    String name;
    int age;
    // TODO: Add constructor here
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    // TODO: Add getter methods here
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    // TODO: Add abstract methods here
    public abstract String makeSound();
    public abstract String move();
    // TODO: Override toString() here
    @Override
    public String toString(){
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
