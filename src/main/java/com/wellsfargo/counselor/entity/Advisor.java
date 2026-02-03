package com.wellsfargo.counselor.entity; // Declares the package for the Advisor entity

import javax.persistence.Entity; // Marks this class as a JPA entity
import javax.persistence.Id; // Identifies the primary key
import javax.persistence.GeneratedValue; // Enables automatic ID generation
import javax.persistence.Column; // Maps fields to database columns

@Entity // Specifies that this class is a database entity
public class Advisor {

    @Id // Marks advisorId as the primary key
    @GeneratedValue // Auto-generates the advisorId value
    private Long advisorId; // Stores the advisor's unique ID

    @Column(nullable = false) // Maps firstName column and disallows nulls
    private String firstName; // Stores advisor first name

    @Column(nullable = false) // Maps lastName column and disallows nulls
    private String lastName; // Stores advisor last name

    @Column(nullable = false) // Maps address column and disallows nulls
    private String address; // Stores advisor address

    @Column(nullable = false) // Maps phone column and disallows nulls
    private String phone; // Stores advisor phone number

    @Column(nullable = false) // Maps email column and disallows nulls
    private String email; // Stores advisor email address

    protected Advisor() {} // Required no-arg constructor for JPA

    public Advisor(String firstName, String lastName, String address, String phone, String email) { // Full constructor
        this.firstName = firstName; // Initializes firstName
        this.lastName = lastName; // Initializes lastName
        this.address = address; // Initializes address
        this.phone = phone; // Initializes phone
        this.email = email; // Initializes email
    }

    public Long getAdvisorId() { return advisorId; } // Returns advisor ID

    public String getFirstName() { return firstName; } // Returns first name

    public void setFirstName(String firstName) { this.firstName = firstName; } // Sets first name

    public String getLastName() { return lastName; } // Returns last name

    public void setLastName(String lastName) { this.lastName = lastName; } // Sets last name

    public String getAddress() { return address; } // Returns address

    public void setAddress(String address) { this.address = address; } // Sets address

    public String getPhone() { return phone; } // Returns phone number

    public void setPhone(String phone) { this.phone = phone; } // Sets phone number

    public String getEmail() { return email; } // Returns email

    public void setEmail(String email) { this.email = email; } // Sets email
}