package com.wellsfargo.counselor.entity; // Declares the package for Client

import javax.persistence.Entity; // Marks class as a JPA entity
import javax.persistence.Id; // Identifies primary key
import javax.persistence.GeneratedValue; // Enables auto ID generation
import javax.persistence.Column; // Maps columns
import javax.persistence.ManyToOne; // Defines many-to-one relationship

@Entity // Declares this class as an entity
public class Client {

    @Id // Primary key
    @GeneratedValue // Auto-generated ID
    private Long clientId; // Client ID

    @ManyToOne // Many clients can be assigned to one advisor
    private Advisor advisor; // Advisor relationship

    @Column(nullable = false) // Non-null column
    private String firstName; // Client first name

    @Column(nullable = false)
    private String lastName; // Client last name

    @Column(nullable = false)
    private String address; // Client address

    @Column(nullable = false)
    private String phone; // Client phone

    @Column(nullable = false)
    private String email; // Client email

    protected Client() {} // Required JPA constructor

    public Client(Advisor advisor, String firstName, String lastName, String address, String phone, String email) {
        this.advisor = advisor; // Initializes advisor
        this.firstName = firstName; // Initializes first name
        this.lastName = lastName; // Initializes last name
        this.address = address; // Initializes address
        this.phone = phone; // Initializes phone
        this.email = email; // Initializes email
    }

    public Long getClientId() { return clientId; } // Returns client ID

    public Advisor getAdvisor() { return advisor; } // Returns advisor

    public void setAdvisor(Advisor advisor) { this.advisor = advisor; } // Sets advisor

    public String getFirstName() { return firstName; } // Returns first name

    public void setFirstName(String firstName) { this.firstName = firstName; } // Sets first name

    public String getLastName() { return lastName; } // Returns last name

    public void setLastName(String lastName) { this.lastName = lastName; } // Sets last name

    public String getAddress() { return address; } // Returns address

    public void setAddress(String address) { this.address = address; } // Sets address

    public String getPhone() { return phone; } // Returns phone

    public void setPhone(String phone) { this.phone = phone; } // Sets phone

    public String getEmail() { return email; } // Returns email

    public void setEmail(String email) { this.email = email; } // Sets email
}