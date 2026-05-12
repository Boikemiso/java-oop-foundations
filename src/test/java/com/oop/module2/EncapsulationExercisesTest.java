package com.oop.module2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Module 2: Encapsulation - Basic Test Stubs
 * 
 * Add your own tests as you complete EncapsulationExercises.java
 */
public class EncapsulationExercisesTest {
    @Test
    void testGettersAndSetters() {
        EncapsulationExercises ex = new EncapsulationExercises(10);
        // TODO: Add assertions for getter/setter on 'name'
    }

    @Test
    void testImmutability() {
        EncapsulationExercises ex = new EncapsulationExercises(42);
        // TODO: Assert that 'id' is set via constructor and cannot change
    }

    @Test
    void testAccessModifiers() {
        // TODO: Test protectedValue and defaultValue fields
    }
}
