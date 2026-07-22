package com.oop.module4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Module 4: Polymorphism - Guided + Student-Authored Tests
 *
 * IMPORTANT:
 * 1) Some tests are intentionally complete and should pass when code TODOs are done.
 * 2) Some tests are intentionally TODO stubs to be completed by the student.
 *
 * Goal:
 * - Practice both coding and testing comprehensively.
 * - Validate dynamic dispatch, polymorphic collections, and safe downcasting.
 */
public class PolymorphismExercisesTest {

    // ============================================================
    // EXERCISE 1: Dynamic Dispatch (Provided tests)
    // ============================================================

    @Test
    public void testCircleAreaDynamicDispatch() {
        PolymorphismExercises.Shape shape = new PolymorphismExercises.Circle(2.0);
        // area = PI * 2^2 = 12.566...
        assertEquals(12.566, shape.area(), 0.01);
    }

    @Test
    public void testRectangleAreaDynamicDispatch() {
        PolymorphismExercises.Shape shape = new PolymorphismExercises.Rectangle(3.0, 4.0);
        assertEquals(12.0, shape.area(), 0.0001);
    }

    @Test
    public void testDescribeUsesConcreteType() {
        PolymorphismExercises.Shape circle = new PolymorphismExercises.Circle(5.0);
        PolymorphismExercises.Shape rectangle = new PolymorphismExercises.Rectangle(2.0, 7.0);

        assertTrue(circle.describe().contains("Circle"));
        assertTrue(rectangle.describe().contains("Rectangle"));
    }

    // ============================================================
    // EXERCISE 2: Polymorphic Collections (Provided tests)
    // ============================================================

    @Test
    public void testTotalAreaAcrossMixedCollection() {
        PolymorphismExercises ex = new PolymorphismExercises();
        List<PolymorphismExercises.Shape> shapes = Arrays.asList(
                new PolymorphismExercises.Circle(1.0),     // PI
                new PolymorphismExercises.Rectangle(2, 3)  // 6
        );

        assertEquals(Math.PI + 6.0, ex.totalArea(shapes), 0.0001);
    }

    @Test
    public void testBuildShapeReportContainsEachShape() {
        PolymorphismExercises ex = new PolymorphismExercises();
        List<PolymorphismExercises.Shape> shapes = Arrays.asList(
                new PolymorphismExercises.Circle(2.0),
                new PolymorphismExercises.Rectangle(4.0, 5.0)
        );

        String report = ex.buildShapeReport(shapes);
        assertTrue(report.contains("Circle"));
        assertTrue(report.contains("Rectangle"));
    }

    // ============================================================
    // EXERCISE 3: Payment Strategy Behavior (Provided tests)
    // ============================================================

    @Test
    public void testCardPaymentFee() {
        PolymorphismExercises.PaymentMethod card = new PolymorphismExercises.CardPayment("Alice");
        assertEquals(2.0, card.fee(100.0), 0.0001);
    }

    @Test
    public void testBankTransferFlatFee() {
        PolymorphismExercises.PaymentMethod bank = new PolymorphismExercises.BankTransferPayment("Bob");
        assertEquals(1.5, bank.fee(200.0), 0.0001);
    }

    @Test
    public void testProcessPaymentsPolymorphicOutput() {
        PolymorphismExercises ex = new PolymorphismExercises();
        List<PolymorphismExercises.PaymentMethod> methods = Arrays.asList(
                new PolymorphismExercises.CardPayment("Alice"),
                new PolymorphismExercises.BankTransferPayment("Bob")
        );

        List<String> lines = ex.processPayments(methods, 100.0);
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).contains("Alice"));
        assertTrue(lines.get(1).contains("Bob"));
    }

    // ============================================================
    // EXERCISE 4: Safe Downcasting (Provided tests)
    // ============================================================

    @Test
    public void testExtractCircleRadiusWhenCircle() {
        PolymorphismExercises ex = new PolymorphismExercises();
        PolymorphismExercises.Shape circle = new PolymorphismExercises.Circle(9.5);
        assertEquals(9.5, ex.tryExtractCircleRadius(circle), 0.0001);
    }

    @Test
    public void testExtractCircleRadiusWhenNotCircle() {
        PolymorphismExercises ex = new PolymorphismExercises();
        PolymorphismExercises.Shape rectangle = new PolymorphismExercises.Rectangle(2, 8);
        assertEquals(-1.0, ex.tryExtractCircleRadius(rectangle), 0.0001);
    }

    // ============================================================
    // STUDENT TASK: Complete testing comprehensively
    // ============================================================

    @Test
    public void testStudentTodo_PaymentProcessMessageQuality() {
        // TODO (Student): Assert process(amount) includes:
        // - payment channel (e.g., card/bank transfer)
        // - account name
        // - amount value
        // WHY: Good tests verify behavior details, not only existence.
    }

    @Test
    public void testStudentTodo_EmptyCollectionsBehavior() {
        // TODO (Student): Decide and test behavior for:
        // - totalArea(emptyList)
        // - buildShapeReport(emptyList)
        // - processPayments(emptyList, amount)
        // WHY: Edge cases often reveal design mistakes.
    }

    @Test
    public void testStudentTodo_ReportFormattingContract() {
        // TODO (Student): Define expected report format and assert it exactly.
        // Possible checks:
        // - one line per shape
        // - line separator rules
        // - stable ordering
        // WHY: Format contracts matter for downstream consumers.
    }
}
