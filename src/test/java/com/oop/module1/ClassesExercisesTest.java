package com.oop.module1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for Module 1: Classes & Objects Exercises
 *
 * This test class validates all 7 exercise implementations.
 * Run with: mvn test -Dtest=ClassesExercisesTest
 */
public class ClassesExercisesTest {

    // ============================================================
    // EXERCISE 1: Person Class Tests (6 tests)
    // ============================================================

    @Test
    public void testPersonClassConstructor() {
        Person person = new Person("John Doe", 30, "john@example.com");
        assertNotNull("Person object should be created", person);
    }

    @Test
    public void testPersonGetters() {
        Person person = new Person("Jane Smith", 28, "jane@example.com");
        assertEquals("Name should be 'Jane Smith'", "Jane Smith", person.getName());
        assertEquals("Age should be 28", 28, person.getAge());
        assertEquals("Email should be 'jane@example.com'", "jane@example.com", person.getEmail());
    }

    @Test
    public void testPersonToString() {
        Person person = new Person("Alice Johnson", 35, "alice@example.com");
        String result = person.toString();
        assertTrue("toString should contain name", result.contains("Alice Johnson"));
        assertTrue("toString should contain age", result.contains("35"));
        assertTrue("toString should contain email", result.contains("alice@example.com"));
    }

    @Test
    public void testPersonToStringFormat() {
        Person person = new Person("Bob", 25, "bob@test.com");
        String expected = "Person{name='Bob', age=25, email='bob@test.com'}";
        assertEquals("toString format should match expected", expected, person.toString());
    }

    @Test
    public void testPersonMultipleInstances() {
        Person person1 = new Person("Person1", 20, "p1@email.com");
        Person person2 = new Person("Person2", 30, "p2@email.com");
        assertNotEquals("Different persons should have different names", person1.getName(), person2.getName());
        assertNotEquals("Different persons should have different ages", person1.getAge(), person2.getAge());
    }

    @Test
    public void testPersonWithSpecialCharacters() {
        Person person = new Person("O'Brien", 40, "obrien+test@company.co.uk");
        assertEquals("Name with apostrophe should be preserved", "O'Brien", person.getName());
        assertEquals("Email with special characters should be preserved", "obrien+test@company.co.uk", person.getEmail());
    }

    // ============================================================
    // EXERCISE 2: BankAccount Class Tests (17 tests)
    // ============================================================

    @Test
    public void testBankAccountConstructor() {
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);
        assertNotNull("BankAccount object should be created", account);
    }

    @Test
    public void testBankAccountGetters() {
        BankAccount account = new BankAccount("654321", "Jane Smith", 5000.0);
        assertEquals("Account number should match", "654321", account.getAccountNumber());
        assertEquals("Owner should match", "Jane Smith", account.getOwner());
        assertEquals("Initial balance should match", 5000.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountDeposit() {
        BankAccount account = new BankAccount("111111", "Bob", 1000.0);
        account.deposit(500.0);
        assertEquals("Balance should be 1500 after deposit", 1500.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountMultipleDeposits() {
        BankAccount account = new BankAccount("222222", "Alice", 1000.0);
        account.deposit(100.0);
        account.deposit(200.0);
        account.deposit(50.0);
        assertEquals("Balance should accumulate deposits", 1350.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountWithdraw() {
        BankAccount account = new BankAccount("333333", "Charlie", 1000.0);
        account.withdraw(300.0);
        assertEquals("Balance should be 700 after withdrawal", 700.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountMultipleWithdrawals() {
        BankAccount account = new BankAccount("444444", "Diana", 1000.0);
        account.withdraw(100.0);
        account.withdraw(200.0);
        account.withdraw(50.0);
        assertEquals("Balance should decrease with withdrawals", 650.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountDepositAndWithdraw() {
        BankAccount account = new BankAccount("555555", "Eve", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(100.0);
        assertEquals("Balance should be 1400", 1400.0, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountDepositNegative() {
        BankAccount account = new BankAccount("666666", "Frank", 1000.0);
        account.deposit(-100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountDepositZero() {
        BankAccount account = new BankAccount("777777", "Grace", 1000.0);
        account.deposit(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountWithdrawNegative() {
        BankAccount account = new BankAccount("888888", "Henry", 1000.0);
        account.withdraw(-100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountWithdrawZero() {
        BankAccount account = new BankAccount("999999", "Iris", 1000.0);
        account.withdraw(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountInsufficientFunds() {
        BankAccount account = new BankAccount("101010", "Jack", 500.0);
        account.withdraw(600.0);
    }

    @Test
    public void testBankAccountWithdrawExactBalance() {
        BankAccount account = new BankAccount("121212", "Kate", 500.0);
        account.withdraw(500.0);
        assertEquals("Balance should be 0 after withdrawing all funds", 0.0, account.getBalance(), 0.01);
    }

    @Test
    public void testBankAccountToString() {
        BankAccount account = new BankAccount("131313", "Liam", 2000.0);
        String result = account.toString();
        assertTrue("toString should contain account number", result.contains("131313"));
        assertTrue("toString should contain owner", result.contains("Liam"));
        assertTrue("toString should contain balance", result.contains("2000.0"));
    }

    @Test
    public void testBankAccountZeroBalance() {
        BankAccount account = new BankAccount("141414", "Mia", 0.0);
        assertEquals("Balance should be 0", 0.0, account.getBalance(), 0.01);
    }

    // ============================================================
    // EXERCISE 3: Car Class Tests (19 tests)
    // ============================================================

    @Test
    public void testCarConstructor() {
        Car car = new Car("Toyota", "Camry", 60.0);
        assertNotNull("Car object should be created", car);
    }

    @Test
    public void testCarInitialState() {
        Car car = new Car("Honda", "Civic", 50.0);
        assertEquals("Make should be Honda", "Honda", car.getMake());
        assertEquals("Model should be Civic", "Civic", car.getModel());
        assertEquals("Current fuel should equal tank capacity", 50.0, car.getCurrentFuel(), 0.01);
        assertEquals("Distance traveled should start at 0", 0.0, car.getDistanceTraveled(), 0.01);
    }

    @Test
    public void testCarDrive() {
        Car car = new Car("Ford", "Mustang", 60.0);
        car.drive(100.0);
        // 100 km * 0.1 L/km = 10 L consumed
        assertEquals("Current fuel should be 50 after driving 100km", 50.0, car.getCurrentFuel(), 0.01);
        assertEquals("Distance traveled should be 100", 100.0, car.getDistanceTraveled(), 0.01);
    }

    @Test
    public void testCarMultipleDrives() {
        Car car = new Car("BMW", "X5", 80.0);
        car.drive(100.0); // 10L consumed
        car.drive(200.0); // 20L consumed
        car.drive(150.0); // 15L consumed
        assertEquals("Current fuel should be 35 after all drives", 35.0, car.getCurrentFuel(), 0.01);
        assertEquals("Distance traveled should be 450", 450.0, car.getDistanceTraveled(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCarDriveNegativeDistance() {
        Car car = new Car("Audi", "A4", 50.0);
        car.drive(-50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCarDriveZeroDistance() {
        Car car = new Car("Audi", "A4", 50.0);
        car.drive(0.0);
    }

    @Test(expected = IllegalStateException.class)
    public void testCarInsufficientFuel() {
        Car car = new Car("Mercedes", "C-Class", 30.0);
        // 30L * 10km/L = 300km max, trying to drive 400km
        car.drive(400.0);
    }

    @Test
    public void testCarDriveExactFuel() {
        Car car = new Car("Lexus", "ES", 40.0);
        // 40L * 10km/L = 400km exactly
        car.drive(400.0);
        assertEquals("Fuel should be exactly 0", 0.0, car.getCurrentFuel(), 0.01);
    }

    @Test
    public void testCarRefuel() {
        Car car = new Car("Nissan", "Altima", 50.0);
        car.drive(200.0); // Uses 20L
        assertEquals("Current fuel should be 30", 30.0, car.getCurrentFuel(), 0.01);
        car.refuel();
        assertEquals("Current fuel should be back to 50", 50.0, car.getCurrentFuel(), 0.01);
    }

    @Test
    public void testCarRefuelAlreadyFull() {
        Car car = new Car("Subaru", "Outback", 60.0);
        // Car starts with full tank
        car.refuel();
        assertEquals("Fuel should remain at capacity", 60.0, car.getCurrentFuel(), 0.01);
    }

    @Test
    public void testCarDriveAfterRefuel() {
        Car car = new Car("Mazda", "3", 55.0);
        car.drive(300.0); // Uses 30L, leaving 25L
        car.refuel();
        assertEquals("Fuel should be 55 after refuel", 55.0, car.getCurrentFuel(), 0.01);
        car.drive(200.0); // Uses 20L
        assertEquals("Fuel should be 35", 35.0, car.getCurrentFuel(), 0.01);
    }

    @Test
    public void testCarSmallDrive() {
        Car car = new Car("Kia", "Forte", 40.0);
        car.drive(10.0); // Uses 1L
        assertEquals("Current fuel should be 39", 39.0, car.getCurrentFuel(), 0.01);
        assertEquals("Distance should be 10", 10.0, car.getDistanceTraveled(), 0.01);
    }

    @Test
    public void testCarToString() {
        Car car = new Car("Tesla", "Model3", 70.0);
        car.drive(50.0);
        String result = car.toString();
        assertTrue("toString should contain make", result.contains("Tesla"));
        assertTrue("toString should contain model", result.contains("Model3"));
        assertTrue("toString should contain fuel", result.contains("65.0") || result.contains("65")); // 70 - 5
        assertTrue("toString should contain distance", result.contains("50"));
    }

    // ============================================================
    // EXERCISE 4: Student Class Tests (8 tests)
    // ============================================================

    @Test
    public void testStudentConstructor() {
        Student student = new Student("John Smith", "S001", 3.8);
        assertNotNull("Student object should be created", student);
    }

    @Test
    public void testStudentGetters() {
        Student student = new Student("Jane Doe", "S002", 3.9);
        assertEquals("Name should be Jane Doe", "Jane Doe", student.getName());
        assertEquals("Student ID should be S002", "S002", student.getStudentId());
        assertEquals("GPA should be 3.9", 3.9, student.getGpa(), 0.01);
    }

    @Test
    public void testStudentIsHonorStudentTrue() {
        Student student = new Student("Alice", "S003", 3.8);
        assertTrue("Student with GPA 3.8 should be honor student", student.isHonorStudent());
    }

    @Test
    public void testStudentIsHonorStudentBoundary() {
        Student student = new Student("Bob", "S004", 3.5);
        assertTrue("Student with GPA exactly 3.5 should be honor student", student.isHonorStudent());
    }

    @Test
    public void testStudentIsHonorStudentFalse() {
        Student student = new Student("Charlie", "S005", 3.4);
        assertFalse("Student with GPA 3.4 should not be honor student", student.isHonorStudent());
    }

    @Test
    public void testStudentIsHonorStudentLow() {
        Student student = new Student("Diana", "S006", 2.5);
        assertFalse("Student with low GPA should not be honor student", student.isHonorStudent());
    }

    @Test
    public void testStudentToString() {
        Student student = new Student("Eve", "S007", 3.6);
        String result = student.toString();
        assertTrue("toString should contain name", result.contains("Eve"));
        assertTrue("toString should contain student ID", result.contains("S007"));
        assertTrue("toString should contain GPA", result.contains("3.6"));
        assertTrue("toString should contain isHonorStudent status", result.toLowerCase().contains("true"));
    }

    @Test
    public void testStudentToStringNotHonor() {
        Student student = new Student("Frank", "S008", 3.2);
        String result = student.toString();
        assertTrue("toString should contain false for non-honor student", result.toLowerCase().contains("false"));
    }

    // ============================================================
    // EXERCISE 5: Product Class Tests (14 tests)
    // ============================================================

    @Test
    public void testProductConstructorAllParams() {
        Product product = new Product("Laptop", 999.99, 5);
        assertNotNull("Product should be created", product);
        assertEquals("Name should be Laptop", "Laptop", product.getName());
        assertEquals("Price should be 999.99", 999.99, product.getPrice(), 0.01);
        assertEquals("Quantity should be 5", 5, product.getQuantity());
    }

    @Test
    public void testProductConstructorTwoParams() {
        Product product = new Product("Mouse", 29.99);
        assertEquals("Name should be Mouse", "Mouse", product.getName());
        assertEquals("Price should be 29.99", 29.99, product.getPrice(), 0.01);
        assertEquals("Quantity should default to 0", 0, product.getQuantity());
    }

    @Test
    public void testProductConstructorOneParam() {
        Product product = new Product("Keyboard");
        assertEquals("Name should be Keyboard", "Keyboard", product.getName());
        assertEquals("Price should default to 0.0", 0.0, product.getPrice(), 0.01);
        assertEquals("Quantity should default to 0", 0, product.getQuantity());
    }

    @Test
    public void testProductGetTotalValue() {
        Product product = new Product("Monitor", 299.99, 3);
        double expectedValue = 299.99 * 3;
        assertEquals("Total value should be 899.97", expectedValue, product.getTotalValue(), 0.01);
    }

    @Test
    public void testProductGetTotalValueZeroQuantity() {
        Product product = new Product("Printer", 199.99, 0);
        assertEquals("Total value should be 0 with zero quantity", 0.0, product.getTotalValue(), 0.01);
    }

    @Test
    public void testProductRestock() {
        Product product = new Product("Headphones", 79.99, 10);
        product.restock(5);
        assertEquals("Quantity should be 15 after restock", 15, product.getQuantity());
    }

    @Test
    public void testProductMultipleRestocks() {
        Product product = new Product("Charger", 19.99, 5);
        product.restock(10);
        product.restock(15);
        assertEquals("Quantity should be 30 after multiple restocks", 30, product.getQuantity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductRestockNegative() {
        Product product = new Product("Cable", 9.99, 5);
        product.restock(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductRestockZero() {
        Product product = new Product("USB", 5.99, 5);
        product.restock(0);
    }

    @Test
    public void testProductSell() {
        Product product = new Product("Adapter", 15.99, 10);
        product.sell(3);
        assertEquals("Quantity should be 7 after selling 3", 7, product.getQuantity());
    }

    @Test
    public void testProductMultipleSells() {
        Product product = new Product("Card", 24.99, 20);
        product.sell(5);
        product.sell(3);
        assertEquals("Quantity should be 12 after selling 8", 12, product.getQuantity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductSellNegative() {
        Product product = new Product("Drive", 49.99, 5);
        product.sell(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductSellZero() {
        Product product = new Product("Port", 39.99, 5);
        product.sell(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductSellMoreThanAvailable() {
        Product product = new Product("Speaker", 99.99, 3);
        product.sell(5);
    }

    @Test
    public void testProductToString() {
        Product product = new Product("Display", 349.99, 2);
        String result = product.toString();
        assertTrue("toString should contain name", result.contains("Display"));
        assertTrue("toString should contain price", result.contains("349.99"));
        assertTrue("toString should contain quantity", result.contains("2"));
        assertTrue("toString should contain total value", result.contains("699.98"));
    }

    // ============================================================
    // EXERCISE 6: Circle Class Tests (10 tests)
    // ============================================================

    @Test
    public void testCircleConstructor() {
        Circle circle = new Circle(5.0);
        assertNotNull("Circle should be created", circle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircleConstructorNegativeRadius() {
        new Circle(-5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircleConstructorZeroRadius() {
        new Circle(0.0);
    }

    @Test
    public void testCircleGetRadius() {
        Circle circle = new Circle(7.5);
        assertEquals("Radius should be 7.5", 7.5, circle.getRadius(), 0.01);
    }

    @Test
    public void testCircleGetArea() {
        Circle circle = new Circle(5.0);
        // Area = π * r^2 = π * 25
        double expectedArea = Math.PI * 25;
        assertEquals("Area should be π * 25", expectedArea, circle.getArea(), 0.01);
    }

    @Test
    public void testCircleGetCircumference() {
        Circle circle = new Circle(10.0);
        // Circumference = 2 * π * r = 2 * π * 10
        double expectedCircumference = 2 * Math.PI * 10;
        assertEquals("Circumference should be 2 * π * 10", expectedCircumference, circle.getCircumference(), 0.01);
    }

    @Test
    public void testCircleGetDiameter() {
        Circle circle = new Circle(6.0);
        assertEquals("Diameter should be 12", 12.0, circle.getDiameter(), 0.01);
    }

    @Test
    public void testCircleSetRadius() {
        Circle circle = new Circle(5.0);
        circle.setRadius(10.0);
        assertEquals("Radius should be 10 after set", 10.0, circle.getRadius(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircleSetRadiusNegative() {
        Circle circle = new Circle(5.0);
        circle.setRadius(-3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircleSetRadiusZero() {
        Circle circle = new Circle(5.0);
        circle.setRadius(0.0);
    }

    @Test
    public void testCircleToString() {
        Circle circle = new Circle(5.0);
        String result = circle.toString();
        assertTrue("toString should contain radius", result.contains("5.0") || result.contains("5"));
        assertTrue("toString should contain area", result.toLowerCase().contains("area"));
        assertTrue("toString should contain circumference", result.toLowerCase().contains("circumference"));
    }

    // ============================================================
    // EXERCISE 7: StringBuffer Class Tests (12 tests)
    // ============================================================

    @Test
    public void testStringBufferConstructor() {
        StringBuffer sb = new StringBuffer("Hello");
        assertNotNull("StringBuffer should be created", sb);
    }

    @Test
    public void testStringBufferGetContent() {
        StringBuffer sb = new StringBuffer("Initial");
        assertEquals("Content should be 'Initial'", "Initial", sb.getContent());
    }

    @Test
    public void testStringBufferAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        assertEquals("Content should be 'Hello World'", "Hello World", sb.getContent());
    }

    @Test
    public void testStringBufferAppendMultiple() {
        StringBuffer sb = new StringBuffer("A");
        sb.append("B").append("C").append("D");
        assertEquals("Content should be 'ABCD' after multiple appends", "ABCD", sb.getContent());
    }

    @Test
    public void testStringBufferPrepend() {
        StringBuffer sb = new StringBuffer("World");
        sb.prepend("Hello ");
        assertEquals("Content should be 'Hello World'", "Hello World", sb.getContent());
    }

    @Test
    public void testStringBufferPrependMultiple() {
        StringBuffer sb = new StringBuffer("D");
        sb.prepend("C").prepend("B").prepend("A");
        assertEquals("Content should be 'ABCD' after multiple prepends", "ABCD", sb.getContent());
    }

    @Test
    public void testStringBufferMixedChaining() {
        StringBuffer sb = new StringBuffer("middle");
        sb.prepend("say ").append("!");
        assertEquals("Content should be 'say middle!'", "say middle!", sb.getContent());
    }

    @Test
    public void testStringBufferClear() {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.clear();
        assertEquals("Content should be empty after clear", "", sb.getContent());
    }

    @Test
    public void testStringBufferClearAndAppend() {
        StringBuffer sb = new StringBuffer("Old Content");
        sb.clear().append("New");
        assertEquals("Content should be 'New' after clear and append", "New", sb.getContent());
    }

    @Test
    public void testStringBufferLength() {
        StringBuffer sb = new StringBuffer("Hello");
        assertEquals("Length should be 5", 5, sb.length());
    }

    @Test
    public void testStringBufferLengthAfterModification() {
        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" There");
        assertEquals("Length should be 8 after append", 8, sb.length());
    }

    @Test
    public void testStringBufferToString() {
        StringBuffer sb = new StringBuffer("Test String");
        String result = sb.toString();
        assertEquals("toString should return content", "Test String", result);
    }

    @Test
    public void testStringBufferComplexChaining() {
        StringBuffer sb = new StringBuffer("World");
        String result = sb
                .prepend("Hello ")
                .append(" from ")
                .append("Java")
                .toString();
        assertEquals("Complex chaining should work correctly", "Hello World from Java", result);
    }
}
