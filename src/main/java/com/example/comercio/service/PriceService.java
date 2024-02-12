package com.example.comercio.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comercio.entity.Price;
import com.example.comercio.repository.PriceRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;
    
    public Price getApplicablePrice(Integer productId, Integer brandId, LocalDateTime applicationDate) {
        return priceRepository.findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
                productId, brandId, applicationDate, applicationDate)
                .stream()
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Price not found"));
    }
}