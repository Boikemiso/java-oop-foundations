package com.oop.module3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

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
        //arrange
        Dog animal = new Dog();
        //act
        animal.breed = "Golden Retriever";
        animal.age = 8;
        animal.name = "Fluffy";
        //assert
        assertNotNull("Animal shouldn't be null ", animal);
        assertEquals("Fluffy", animal.getName());
        assertEquals(8, animal.getAge());
        assertEquals("Golden Retriever", animal.getBreed());
    }

    @Test
    public void testCatConstructorAndInitialState() {
        // TODO: Create a Cat and validate inherited + cat-specific fields.
        // Hint: Use assertEquals and assertTrue/assertFalse for boolean state.
        //arrange
        Cat animal2 = new Cat();
        //act
        animal2.indoor = true;
        //assert
        assertTrue("Cat does not inherit from animal",animal2 instanceof Animal);
        assertEquals("Zuri",animal2.getName());
        assertEquals(13 ,animal2.getAge());
        assertTrue(animal2.isIndoor());
    }

    @Test
    public void testBirdConstructorAndInitialState() {
        // TODO: Create a Bird and validate inherited + wingspan values.
        // Hint: Use assertEquals with delta for double comparisons.
        //arrange
        Bird animal3 = new Bird();
        //act
        animal3.age = 3;
        animal3.name = "Zeus";
        animal3.wingspan = 18.509;
        //assert
        assertEquals("Zeus", animal3.getName());
        assertEquals(3, animal3.getAge());
        //Delta tests the diffence between the actual and the expected
        assertEquals(18.5, animal3.getWingspan(), 0.01);
    }

    // ============================================================
    // EXERCISE 2: Getter Methods
    // ============================================================

    @Test
    public void testAnimalGettersThroughDog() {
        // TODO: Verify inherited getters (getName/getAge) via Dog instance.
        // Hint: assertEquals(expected, actual)
        Dog animal = new Dog("Fluffy", 8, "Golden Retriever");
        assertEquals("Fluffy", animal.getName());
        assertEquals(8, animal.getAge());
    }

    @Test
    public void testSubclassSpecificGetters() {
        // TODO: Verify getBreed, isIndoor, and getWingspan.
        // Hint: Use assertEquals + assertTrue/assertFalse as needed.
        Dog animal = new Dog("Fluffy", 8, "Golden Retriever");
        assertEquals("Golden Retriever", animal.getBreed());
        Cat animal2 = new Cat("Zuri", 13, true);
        assertTrue(animal2.isIndoor());
        Bird animal3 = new Bird("Zeus", 3, 18.5);
        assertEquals(18.5, animal3.getWingspan(), 0.001);
    }

    // ============================================================
    // EXERCISE 3: Inherited + Overridden Methods
    // ============================================================

    @Test
    public void testOverriddenMakeSoundMethods() {
        // TODO: Assert each subclass returns its own sound implementation.
        // Hint: Compare Dog/Cat/Bird outputs with assertEquals.
        Dog animal = new Dog("Fluffy", 8, "Golden Retriever");
        assertEquals("Dog should make barking sound", "Woof", animal.makeSound());
        Cat animal2 = new Cat("Zuri", 13, true);
        assertEquals("Cat should make meowing sound","Meow",animal2.makeSound());
        Bird animal3 = new Bird("Zeus", 3, 18.5);
        assertEquals("Bird should make chirping sound","Chirp", animal3.makeSound());
    }

    @Test
    public void testOverriddenMoveMethods() {
        // TODO: Assert each subclass has distinct move behavior.
        // Hint: assertEquals for exact text or assertTrue for keywords.
        Dog animal = new Dog("Fluffy", 8, "Golden Retriever");
        assertEquals("Dog should be running forward", "Runs forward", animal.move());
        Cat animal2 = new Cat("Zuri", 13, true);
        assertEquals("Cat should be pouncing to the left","Pounces to the left",animal2.move());
        Bird animal3 = new Bird("Zeus", 3, 18.5);
        assertEquals("Bird should be flying up","Fly up", animal3.move());
    }

    @Test
    public void testVehicleSharedBehavior() {
        // TODO: Verify accelerate and brake from Vehicle are inherited correctly.
        // Hint: assertEquals speed before/after operations.
        Car car = new Car("Toyota", 56.4, 4);
        assertEquals(56.4, car.getSpeed(), 0.001);
        car.accelerate(12);
        assertEquals(68.4, car.getSpeed(), 0.001);
        car.brake(4);
        assertEquals(64.4, car.getSpeed(), 0.001);
    }

    @Test
    public void testVehicleTypeOverriding() {
        // TODO: Verify Car and Truck override getType differently.
        // Hint: assertNotEquals between sibling subtype type strings.
        Car car = new Car("Toyota", 56.4, 4);
        Truck truck = new Truck("Audi", 43, 500);
        assertNotEquals("Truck", car.getType());
        assertNotEquals("Car", truck.getType());
    }

    // ============================================================
    // EXERCISE 4: toString Implementations
    // ============================================================

    @Test
    public void testAnimalHierarchyToString() {
        // TODO: Validate Dog/Cat/Bird toString contains key inherited fields.
        // Hint: assertTrue(result.contains("expected-value"))
        Dog animal = new Dog("Fluffy", 8, "Golden Retriever");
        Cat animal2 = new Cat("Zuri", 13, true);
        Bird animal3 = new Bird("Zeus", 3, 18.5);
        assertTrue(animal.toString().contains("Fluffy"));
        assertTrue(animal.toString().contains("8"));
        assertTrue(animal.toString().contains("Golden Retriever"));

        assertTrue(animal2.toString().contains("Zuri"));
        assertTrue(animal2.toString().contains("13"));
        assertTrue(animal2.toString().contains("true"));

        assertTrue(animal3.toString().contains("Zeus"));
        assertTrue(animal3.toString().contains("3"));
        assertTrue(animal3.toString().contains("18.5"));
    }

    @Test
    public void testVehicleHierarchyToString() {
        // TODO: Validate Car/Truck toString includes brand, speed, and subtype data.
        // Hint: assertTrue with multiple contains checks.
        Car car = new Car("Toyota", 56.4, 4);
        Truck truck = new Truck("Audi", 43, 500);
        assertTrue(car.toString().contains("Toyota"));
        assertTrue(car.toString().contains("56.4"));
        assertTrue(car.toString().contains("4"));

        assertTrue(truck.toString().contains("Audi"));
        assertTrue(truck.toString().contains("43"));
        assertTrue(truck.toString().contains("500"));
    }

    // ============================================================
    // EXERCISE 5: Exception Handling
    // ============================================================

    @Test
    public void testVehicleBrakeDoesNotGoNegative() {
        // TODO: Decide expected behavior when braking below 0 speed and test it.
        // Hint: You can assert clamping with assertEquals or exception with assertThrows pattern.
        Car car = new Car("Toyota", 56.4, 4);
//Try catch way
//        try{
//            car.brake(40);
//            fail("Speed is less than zero and is considered valid but is wrong");
//        }catch (IllegalArgumentException e){
//            assertTrue(true);
//        }
        car.brake(20);
        assertEquals(36.4, car.getSpeed(), 0.001);
        car.brake(36.4);
        assertEquals(0.0, car.getSpeed(), 0.001);

        assertThrows(IllegalArgumentException.class,()->{
            car.brake(-8);
        });
    }

    @Test
    public void testTruckLoadCargoValidation() {
        // TODO: If loadCargo enforces payload limits, test valid and invalid weights.
        // Hint: Use try/catch + fail(...) for JUnit 4 exception assertions.
        Truck truck = new Truck("Audi", 43, 500);

        truck.loadCargo(100);
        assertEquals(100, truck.getCurrentLoad(), 0.001);

        truck.loadCargo(150);
        assertEquals(250, truck.getCurrentLoad(), 0.001);

        try{
            truck.loadCargo(300);
            fail("Throws exception");
        }catch(Exception e){
            assertFalse(truck.getCurrentLoad() == 550);
        }
    }
}
