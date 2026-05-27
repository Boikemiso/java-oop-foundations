package com.oop.module2;



import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Module 2: Encapsulation - Basic Test Stubs
 * 
 * Add your own tests as you complete EncapsulationExercises.java
 */
public class EncapsulationExercisesTest {
    @Test
    public void testGettersAndSetters() {
        //the class being tested
        EncapsulationExercises ex = new EncapsulationExercises(10);
        try{
            //method takes a string as a parameter
        ex.getClass().getMethod("setName", String.class);
        //calls setName method and passes John as the argument
        ex.setName("John");
        }catch(NoSuchMethodException e){
            fail("The setName() method has not been found");
        }
        try{
            ex.getClass().getMethod("getName");
            assertEquals("getName should return name", "John",ex.getName());
        }catch(NoSuchMethodException e){
            fail("The getName() method has not been found");
        }
        // TODO: Add assertions for getter/setter on 'name'

    }
// == is for object equality
   // dot equal content equality

    @Test
    public void testImmutability() {
        EncapsulationExercises ex = new EncapsulationExercises(42);
        // TODO: Assert that 'id' is set via constructor and cannot change
        try{
            ex.getClass().getMethod("getId");
            assertEquals("getId()should return 42", 42, ex.getId());
        }catch(NoSuchMethodException e){
            fail("getId() method not found");
        }

        try{
            ex.getClass().getMethod("setId", int.class);
            fail("setId() should not exist");
        }catch(NoSuchMethodException e){
            assertTrue("id is immutable", true);
        }
    }

    @Test
    public void testAccessModifiers() {
        EncapsulationExercises ex = new EncapsulationExercises(1, 2, 5);
        // TODO: Test protectedValue and defaultValue fields
        assertEquals("Protected value should be accessible", 2, ex.protectedValue);
        ex.protectedValue = 3;
        assertEquals("Protected value should be modifiable", 3, ex.protectedValue);

        assertEquals("Default value should be accessible", 5, ex.defaultValue);
        ex.defaultValue = 9;
        assertEquals("Default value should be modifiable",9, ex.defaultValue);
    }
}
