package com.register.registration.entity;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    @Column(name = "total_price") // Add this annotation to specify the column name
    private double totalPrice;

    @Column(name = "user_id", nullable = false) // Change to simple column
    private Long userId;

    // Other fields and methods...

    // Setter method for userId
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
