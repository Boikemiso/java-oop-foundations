package com.oop.module3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Module 3: Inheritance - Test Template
 *
 * TODO: Write meaningful tests as you implement Animal, Dog, Cat, Bird,
 * Vehicle, Car, and Truck.
 *
 * WHY: Writing your own tests helps you:
 * - Think about behavior before implementation (TDD mindset)
 * - Verify inheritance and method overriding intentionally
 * - Practice choosing the right assertion for each expectation
 */
public class InheritanceExercisesTest {

    // ============================================================
    // EXERCISE 1: Animal + Dog/Cat/Bird Constructor & Initial State
    // ============================================================

    @Test
    public void testDogConstructorAndInitialState() {
        // TODO: Create a Dog and validate constructor-initialized values.
        // Hint: Use assertNotNull and assertEquals for name/age/breed.
    }

    @Test
    public void testCatConstructorAndInitialState() {
        // TODO: Create a Cat and validate inherited + cat-specific fields.
        // Hint: Use assertEquals and assertTrue/assertFalse for boolean state.
    }

    @Test
    public void testBirdConstructorAndInitialState() {
        // TODO: Create a Bird and validate inherited + wingspan values.
        // Hint: Use assertEquals with delta for double comparisons.
    }

    // ============================================================
    // EXERCISE 2: Getter Methods
    // ============================================================

    @Test
    public void testAnimalGettersThroughDog() {
        // TODO: Verify inherited getters (getName/getAge) via Dog instance.
        // Hint: assertEquals(expected, actual)
    }

    @Test
    public void testSubclassSpecificGetters() {
        // TODO: Verify getBreed, isIndoor, and getWingspan.
        // Hint: Use assertEquals + assertTrue/assertFalse as needed.
    }

    // ============================================================
    // EXERCISE 3: Inherited + Overridden Methods
    // ============================================================

    @Test
    public void testOverriddenMakeSoundMethods() {
        // TODO: Assert each subclass returns its own sound implementation.
        // Hint: Compare Dog/Cat/Bird outputs with assertEquals.
    }

    @Test
    public void testOverriddenMoveMethods() {
        // TODO: Assert each subclass has distinct move behavior.
        // Hint: assertEquals for exact text or assertTrue for keywords.
    }

    @Test
    public void testVehicleSharedBehavior() {
        // TODO: Verify accelerate and brake from Vehicle are inherited correctly.
        // Hint: assertEquals speed before/after operations.
    }

    @Test
    public void testVehicleTypeOverriding() {
        // TODO: Verify Car and Truck override getType differently.
        // Hint: assertNotEquals between sibling subtype type strings.
    }

    // ============================================================
    // EXERCISE 4: toString Implementations
    // ============================================================

    @Test
    public void testAnimalHierarchyToString() {
        // TODO: Validate Dog/Cat/Bird toString contains key inherited fields.
        // Hint: assertTrue(result.contains("expected-value"))
    }

    @Test
    public void testVehicleHierarchyToString() {
        // TODO: Validate Car/Truck toString includes brand, speed, and subtype data.
        // Hint: assertTrue with multiple contains checks.
    }

    // ============================================================
    // EXERCISE 5: Exception Handling
    // ============================================================

    @Test
    public void testVehicleBrakeDoesNotGoNegative() {
        // TODO: Decide expected behavior when braking below 0 speed and test it.
        // Hint: You can assert clamping with assertEquals or exception with assertThrows pattern.
    }

    @Test
    public void testTruckLoadCargoValidation() {
        // TODO: If loadCargo enforces payload limits, test valid and invalid weights.
        // Hint: Use try/catch + fail(...) for JUnit 4 exception assertions.
    }
}
