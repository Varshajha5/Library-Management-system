// BookDAO.java
package dao;

import model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public void addBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (title, author, isbn, published_year, quantity, available_quantity) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getIsbn());
            stmt.setInt(4, book.getPublishedYear());
            stmt.setInt(5, book.getQuantity());
            stmt.setInt(6, book.getAvailableQuantity());
            
            stmt.executeUpdate();
        }
    }
    
    public List<Book> getAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setIsbn(rs.getString("isbn"));
                book.setPublishedYear(rs.getInt("published_year"));
                book.setQuantity(rs.getInt("quantity"));
                book.setAvailableQuantity(rs.getInt("available_quantity"));
                
                books.add(book);
            }
        }
        return books;
    }
    
    // Add update, delete, and search methods...
}
