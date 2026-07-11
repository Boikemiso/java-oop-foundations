package com.oop.module1;

/**
 * Exercise: LibraryBook Class
 *
 * TODO: Create a LibraryBook class with the following requirements:
 *
 * 1. Fields:
 *    - title (String) - book title, e.g., "The Great Gatsby"
 *    - author (String) - book author, e.g., "F. Scott Fitzgerald"
 *    - pages (int) - total number of pages
 *    - currentPage (int) - current page the reader is on
 *    - isOpen (boolean) - whether the book is currently open
 *
 * 2. Constructor:
 *    - A constructor that accepts title, author, and pages
 *    - Should initialize currentPage to 1 (first page)
 *    - Should initialize isOpen to false (book starts closed)
 *
 * 3. Methods:
 *    - getTitle() - returns the title
 *    - getAuthor() - returns the author
 *    - getPages() - returns total pages
 *    - getCurrentPage() - returns current page
 *    - isOpen() - returns whether book is open
 *    - openBook() - sets isOpen to true
 *    - closeBook() - sets isOpen to false
 *    - turnPage() - advances currentPage by 1
 *      * Should throw IllegalStateException if book is not open
 *      * Should throw IllegalStateException if already at last page
 *    - turnPages(int count) - advances currentPage by count
 *      * Should throw IllegalArgumentException if count <= 0
 *      * Should throw IllegalStateException if book is not open
 *      * Should throw IllegalStateException if would exceed total pages
 *    - toString() - returns "LibraryBook{title='The Great Gatsby', author='F. Scott Fitzgerald', currentPage=1, totalPages=180, isOpen=false}"
 *
 * WHY: This exercise teaches you how to:
 * - Maintain state across multiple method calls
 * - Validate state before operations (check isOpen before turning pages)
 * - Enforce boundaries (currentPage cannot exceed total pages)
 * - Use boolean fields to control behavior
 */
public class LibraryBook {
    // TODO: Add fields here
    String title;
    String author;
    int pages;
    int currentPage;
    boolean isOpen;
    // TODO: Add constructor here
    public LibraryBook(String title, String author, int pages){
        this.currentPage = 1;
        this.isOpen = false;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // TODO: Add getter methods here
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages(){
        return pages;
    }

    public int getCurrentPage(){
        return currentPage;
    }

    public boolean isOpen(){
        return isOpen;
    }
    // TODO: Add openBook and closeBook methods here
    public void openBook(){
        isOpen = true;
    }

    public void closeBook(){
        isOpen = false;
    }
    // TODO: Add turnPage method here
    public void turnPage(){
        if (isOpen = true ){
            currentPage += 1;
        } if(isOpen = false){
            throw new IllegalStateException("Book is not open");
        }
    }
    // TODO: Add turnPages method here

    // TODO: Override toString() here
    @Override
    public String toString(){
        return title;
    }
}