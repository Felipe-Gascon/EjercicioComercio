package com.example.comercio.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRICES")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "BRAND_ID")
    private Integer brandId;
    
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    
    @Column(name = "PRICE_LIST")
    private Integer priceList;
    
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    
    @Column(name = "PRIORITY")
    private Integer priority;
    
    @Column(name = "PRICE")
    private BigDecimal price;
    
    @Column(name = "CURR")
    private String currency;
}