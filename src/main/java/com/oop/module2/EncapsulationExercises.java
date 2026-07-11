package com.oop.module2;

import com.oop.module1.Student;

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
    public String getName(){
        return name;
    }
    //arrange
    //act
    //assert
    // TODO: Add a setter for 'name'
    public void setName(String name){
        this.name = name;
    }
    // Exercise 2: Keep a field immutable
    // TODO: Make 'id' immutable (assignable only via constructor, never changeable)
    private final int id;
    
    public EncapsulationExercises(int id) {
        this.id = id;
    }

    // TODO: Add a getter for 'id'
    public int getId(){
        return id;
    }

    // Exercise 3: Use protected and package-private fields
    // TODO: Add a protected field 'protectedValue' (type: int)
    //It can be inherited by the  child class and classes in same package
    protected int protectedValue;
    // TODO: Add a package-private field 'defaultValue' (type: int)
    int defaultValue;
    // TODO: Add a constructor that sets 'protectedValue' and 'defaultValue'
    public EncapsulationExercises(int id, int protectedValue, int defaultValue){
        this.protectedValue = protectedValue;
        this.defaultValue = defaultValue;
        this.id = id;
    }

    public void setId(int id){
        //this.id = id;
    }

    //package
    //imports
    //class definitions
    //field members
    //methods
    //main
    // Optional: Add meaningful JavaDoc comments to your getters/setters
}
