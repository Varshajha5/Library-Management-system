// Loan.java
package model;

import java.time.LocalDate;

public class Loan {
    private int loanId;
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;

    // Constructors, getters, and setters
    public Loan() {}
    
    public Loan(Book book, Member member, LocalDate dueDate) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
        this.dueDate = dueDate;
        this.status = "On Loan";
    }
    
    // Add all getters and setters here...
}
