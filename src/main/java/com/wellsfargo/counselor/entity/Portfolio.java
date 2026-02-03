package com.wellsfargo.counselor.entity; // Declares package

import javax.persistence.Entity; // Marks entity
import javax.persistence.Id; // Primary key
import javax.persistence.GeneratedValue; // Auto-generated ID
import javax.persistence.Column; // Column mapping
import javax.persistence.ManyToOne; // Relationship mapping

@Entity // Declares entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId; // Portfolio ID

    @ManyToOne
    private Client client; // Client relationship

    @Column(nullable = false)
    private String creationDate; // Portfolio creation date

    protected Portfolio() {} // Required by JPA

    public Portfolio(Client client, String creationDate) {
        this.client = client; // Initializes client
        this.creationDate = creationDate; // Initializes date
    }

    public Long getPortfolioId() { return portfolioId; } // Returns portfolio ID

    public Client getClient() { return client; } // Returns client

    public void setClient(Client client) { this.client = client; } // Sets client

    public String getCreationDate() { return creationDate; } // Returns date

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; } // Sets date
}