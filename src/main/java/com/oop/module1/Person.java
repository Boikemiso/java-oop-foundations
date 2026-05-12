package com.oop.module1;

/**
 * Exercise 1: Person Class
 *
 * TODO: Create a Person class with the following requirements:
 * 1. Fields:
 *    - name (String)
 *    - age (int)
 *    - email (String)
 *
 * 2. Constructor:
 *    - A constructor that accepts name, age, and email
 *    - Should initialize all three fields
 *
 * 3. Methods:
 *    - getAge() - returns the age
 *    - getName() - returns the name
 *    - getEmail() - returns the email
 *    - toString() - returns a String representation like "Person{name='John', age=30, email='john@example.com'}"
 *
 * WHY: This exercise teaches you how to:
 * - Define fields that represent object state
 * - Create constructors to initialize objects
 * - Use getters to access object data
 * - Override toString() for meaningful object representation
 */
public class Person {
    // TODO: Add fields here
    String name;
    int age;
    String email;
    // TODO: Add constructor here
    public Person(String name, int age, String email){
        //Refers to the class fields
        //Without this it refers to the parameters
        this.name = name;
        this.age = age;
        this.email = email;
    }
    // TODO: Add getter methods here
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }
    // TODO: Override toString() here
    @Override
    public String toString() {
        return "Person{name="+""+"'"+name+"', "+ "age="+age+", "+"email="+"'"+ email+"'}";
    }

}
