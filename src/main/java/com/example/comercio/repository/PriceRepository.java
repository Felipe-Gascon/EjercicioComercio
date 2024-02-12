package com.example.comercio.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.comercio.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
        Integer productId, Integer brandId, LocalDateTime startDate, LocalDateTime endDate);
}