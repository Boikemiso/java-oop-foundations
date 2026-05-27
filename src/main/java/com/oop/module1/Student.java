package com.oop.module1;

import com.oop.module2.EncapsulationExercises;

/**
 * Exercise 4: Student Class
 *
 * TODO: Create a Student class with the following requirements:
 * 1. Fields:
 *    - name (String)
 *    - studentId (String)
 *    - gpa (double)
 *
 * 2. Constructor:
 *    - A constructor that accepts name, studentId, and gpa
 *    - Should initialize all three fields
 *
 * 3. Methods:
 *    - getName() - returns the name
 *    - getStudentId() - returns the student ID
 *    - getGpa() - returns the GPA
 *    - isHonorStudent() - returns true if GPA >= 3.5, false otherwise
 *    - toString() - returns "Student{name='Alice', studentId='S123', gpa=3.8, isHonorStudent=true}"
 *
 * WHY: This exercise teaches you how to:
 * - Compute derived properties from fields (isHonorStudent based on GPA)
 * - Use conditional logic in methods
 * - Include computed properties in toString()
 * - Understand that methods can return different types (boolean, String, double)
 */
public class Student extends EncapsulationExercises {
    // TODO: Add fields here
    String name;
    String studentId;
    double gpa;
    
    // TODO: Add constructor here
    public Student(String name, String studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    // TODO: Add getter methods here
    public String getName(){
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    // TODO: Add isHonorStudent method here
    public boolean isHonorStudent(){
        if(gpa >= 3.5){
            return true;
        }else {
            return false;
        }
    }
    // TODO: Override toString() here

    @Override
    public String toString() {
        return "Student{name='" + name + "studentId=," + studentId + "gpa=," + gpa + "isHonorStudent=" + isHonorStudent() + "}";
    }

    public Student(){

    }

    public static void main (String [] args){
        Student student = new Student( "John", "5590", 4.5);
        EncapsulationExercises exercises = new EncapsulationExercises(90);
        EncapsulationExercises object1 = new EncapsulationExercises(85, 36, 33);

        //Student object2 = new EncapsulationExercises(8, 56, 34);
        //A big class cannot be type casted
        EncapsulationExercises object3 = new Student("John", "56", 34);

        new Student()
    }
}
