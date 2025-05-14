// Member.java
package model;

import java.time.LocalDate;

public class Member {
    private int memberId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDate joinDate;

    // Constructors, getters, and setters
    public Member() {}
    
    public Member(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.joinDate = LocalDate.now();
    }
    
    // Add all getters and setters here...
}
