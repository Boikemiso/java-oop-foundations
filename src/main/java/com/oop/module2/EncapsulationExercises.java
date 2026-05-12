package com.oop.module2;

/**
 * Module 2: Encapsulation
 * 
 * Topics: Access modifiers, getters/setters, immutability
 * Instructions: Complete the TODOs for each exercise below.
 */
public class EncapsulationExercises {

    // Exercise 1: Use private fields and provide public getter/setter
    // TODO: Make 'name' private and provide public getter and setter methods
    private String name;

    // TODO: Add a getter for 'name'
    // TODO: Add a setter for 'name'

    // Exercise 2: Keep a field immutable
    // TODO: Make 'id' immutable (assignable only via constructor, never changeable)
    private final int id;
    
    public EncapsulationExercises(int id) {
        this.id = id;
    }

    // TODO: Add a getter for 'id'
    
    // Exercise 3: Use protected and package-private fields
    // TODO: Add a protected field 'protectedValue' (type: int)
    // TODO: Add a package-private field 'defaultValue' (type: int)
    
    // TODO: Add a constructor that sets 'protectedValue' and 'defaultValue'
    
    // Optional: Add meaningful JavaDoc comments to your getters/setters
}
