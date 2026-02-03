package com.wellsfargo.counselor.entity; // Declares package

import javax.persistence.Entity; // Marks entity
import javax.persistence.Id; // Primary key
import javax.persistence.GeneratedValue; // Auto-generated ID
import javax.persistence.Column; // Column mapping
import javax.persistence.ManyToOne; // Relationship mapping

@Entity // Declares entity
public class Security {

    @Id
    @GeneratedValue
    private Long securityId; // Security ID

    @ManyToOne
    private Portfolio portfolio; // Portfolio relationship

    @Column(nullable = false)
    private String name; // Security name

    @Column(nullable = false)
    private String category; // Security category

    @Column(nullable = false)
    private float purchasePrice; // Purchase price

    @Column(nullable = false)
    private String purchaseDate; // Purchase date

    @Column(nullable = false)
    private float quantity; // Quantity purchased

    protected Security() {} // Required by JPA

    public Security(Portfolio portfolio, String name, String category, float purchasePrice, String purchaseDate, float quantity) {
        this.portfolio = portfolio; // Initializes portfolio
        this.name = name; // Initializes name
        this.category = category; // Initializes category
        this.purchasePrice = purchasePrice; // Initializes price
        this.purchaseDate = purchaseDate; // Initializes date
        this.quantity = quantity; // Initializes quantity
    }

    public Long getSecurityId() { return securityId; } // Returns ID

    public Portfolio getPortfolio() { return portfolio; } // Returns portfolio

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; } // Sets portfolio

    public String getName() { return name; } // Returns name

    public void setName(String name) { this.name = name; } // Sets name

    public String getCategory() { return category; } // Returns category

    public void setCategory(String category) { this.category = category; } // Sets category

    public float getPurchasePrice() { return purchasePrice; } // Returns price

    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; } // Sets price

    public String getPurchaseDate() { return purchaseDate; } // Returns date

    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; } // Sets date

    public float getQuantity() { return quantity; } // Returns quantity

    public void setQuantity(float quantity) { this.quantity = quantity; } // Sets quantity
}