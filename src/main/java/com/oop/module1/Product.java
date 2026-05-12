package com.oop.module1;
/**
 * Exercise 3: Car Class
 *
 * TODO: Create a Car class with the following requirements:
 * 1. Fields:
 *    - name (String) - product name, e.g., "Laptop"
 *    - price (double) - product price, e.g., 999.99
 *    - quantity (int) - number in stock, e.g., 5
 *
 * 2. Constructors (overloading):
 *    - Product(String name, double price, int quantity) - all three fields
 *    - Product(String name, double price) - quantity defaults to 0
 *    - Product(String name) - price defaults to 0.0, quantity defaults to 0
 *
 *  3. Methods:
 *    - getName() - returns the name
 *    - getPrice() - returns the price
 *    - getQuantity() - returns the quantity
 *    - getTotalValue() - returns price * quantity
 *    - restock(int amount) - adds amount to quantity
 *      * Throws IllegalArgumentException if amount <= 0
 *    - sell(int amount) - subtracts amount from quantity
 *      * Throws IllegalArgumentException if amount <= 0
 *      * Throws IllegalArgumentException if amount > quantity
 *    - toString() - returns format like:
 *      "Product{name='Laptop', price=999.99, quantity=5, totalValue=4999.95}"
 */
//Dockerise
//Automated test
//Identity
public class Product {
    // TODO: Add fields here
    String name;
    double price;
    int quantity;
    double totalValue;
    // TODO: Add constructor here
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public Product(String name){
        this.name = name;
        price = 0.0;
        quantity = 0;
    }
    // TODO: Add getter methods here
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalValue(){
        return totalValue = price * quantity;
    }
    // TODO: Add restock method here
    public void restock(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Restock amount must be positive");
        }

        quantity += amount;
    }

    // TODO: Add sell method here
    public void sell(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Sell amount must be positive");
        }
        if(amount > quantity){
            throw new IllegalArgumentException("Not enough stock");
        }
        quantity -= amount;
    }
    // TODO: Override toString() here
    public String toString(){
        return "Product{name='" + name + ", price=" + price + ", quantity=" + quantity + ",totalValue=" + getTotalValue() + "}";
    }
}
