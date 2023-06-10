package com.example.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Long userId;

    public Coupon() {
    }

    public Coupon(final Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
