// Book.java
package model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private int quantity;
    private int availableQuantity;

    // Constructors, getters, and setters
    public Book() {}
    
    public Book(String title, String author, String isbn, int publishedYear, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.quantity = quantity;
        this.availableQuantity = quantity;
    }
    
    // Add all getters and setters here...
}
