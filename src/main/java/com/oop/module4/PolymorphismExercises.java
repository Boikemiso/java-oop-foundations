package com.oop.module4;

import java.util.ArrayList;
import java.util.List;

/**
 * Module 4: Polymorphism
 *
 * Topics: Dynamic dispatch, upcasting, polymorphic collections
 *
 * Instructions:
 * - Complete the TODOs in this file and in Module 4 tests.
 * - Focus on runtime behavior: the declared type can be a parent type,
 *   but the executed method should come from the concrete subclass.
 * - Keep method names/signatures exactly as provided so tests can target them.
 */
public class PolymorphismExercises {

    // ============================================================
    // EXERCISE 1: Shape hierarchy + dynamic dispatch
    // ============================================================

    /**
     * Base type for all shapes in this module.
     *
     * TODO (Student):
     * - Ensure subclasses override area() and describe().
     */
    public static class Shape {
        public double area() {
            // Base/default implementation for unknown shape.
            return 0.0;
        }

        public String describe() {
            return "Generic Shape";
        }
    }

    /**
     * TODO (Student):
     * - Implement area() using PI * r * r
     * - Override describe() to include radius
     */
    public static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double area() {
            // TODO: Replace placeholder with actual formula.
            return 0.0;
        }

        @Override
        public String describe() {
            // TODO: Return something like "Circle(radius=2.0)"
            return "TODO";
        }
    }

    /**
     * TODO (Student):
     * - Implement area() using width * height
     * - Override describe() to include width/height
     */
    public static class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public double area() {
            // TODO: Replace placeholder with actual formula.
            return 0.0;
        }

        @Override
        public String describe() {
            // TODO: Return something like "Rectangle(width=3.0, height=4.0)"
            return "TODO";
        }
    }

    // ============================================================
    // EXERCISE 2: Payment methods + runtime behavior variation
    // ============================================================

    public static abstract class PaymentMethod {
        protected final String accountName;

        protected PaymentMethod(String accountName) {
            this.accountName = accountName;
        }

        public String getAccountName() {
            return accountName;
        }

        /**
         * Returns a status message describing payment processing behavior.
         */
        public abstract String process(double amount);

        /**
         * Optional hook for fees. Override when needed.
         */
        public double fee(double amount) {
            return 0.0;
        }
    }

    /**
     * TODO (Student):
     * - process(amount): include account name + amount + channel
     * - fee(amount): use 2% card fee
     */
    public static class CardPayment extends PaymentMethod {
        public CardPayment(String accountName) {
            super(accountName);
        }

        @Override
        public String process(double amount) {
            // TODO: Provide meaningful message.
            return "TODO";
        }

        @Override
        public double fee(double amount) {
            // TODO: Return 2% of amount.
            return 0.0;
        }
    }

    /**
     * TODO (Student):
     * - process(amount): include account name + amount + channel
     * - fee(amount): use fixed flat fee of 1.50
     */
    public static class BankTransferPayment extends PaymentMethod {
        public BankTransferPayment(String accountName) {
            super(accountName);
        }

        @Override
        public String process(double amount) {
            // TODO: Provide meaningful message.
            return "TODO";
        }

        @Override
        public double fee(double amount) {
            // TODO: Return fixed fee.
            return 0.0;
        }
    }

    // ============================================================
    // EXERCISE 3: Polymorphic collections
    // ============================================================

    /**
     * TODO (Student):
     * - Iterate over shapes and sum shape.area().
     * - Dynamic dispatch should call the correct subclass implementation.
     */
    public double totalArea(List<Shape> shapes) {
        double total = 0.0;
        // TODO: Implement accumulation logic.
        return total;
    }

    /**
     * TODO (Student):
     * - Build one formatted line per shape using shape.describe().
     * - Join lines using "\n".
     */
    public String buildShapeReport(List<Shape> shapes) {
        // TODO: Implement report generation.
        return "";
    }

    /**
     * TODO (Student):
     * - Process each payment and compute final charged amount (amount + fee)
     * - Return one line per payment strategy
     */
    public List<String> processPayments(List<PaymentMethod> methods, double amount) {
        List<String> output = new ArrayList<>();
        // TODO: Fill output with polymorphic processing details.
        return output;
    }

    // ============================================================
    // EXERCISE 4: Safe downcasting
    // ============================================================

    /**
     * TODO (Student):
     * - If shape is Circle, return its radius.
     * - Otherwise return -1.
     *
     * WHY:
     * - Demonstrates instanceof before downcasting.
     */
    public double tryExtractCircleRadius(Shape shape) {
        // TODO: Implement safe downcast.
        return -1;
    }
}
