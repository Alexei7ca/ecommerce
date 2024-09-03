package com.decskill.ecommerce.repository;

import com.decskill.ecommerce.domain.Brand;
import com.decskill.ecommerce.domain.Price;

import java.time.LocalDateTime;

public interface CustomPriceRepository {
    Price findFirstPriceByProductBrandAndDate(LocalDateTime date, Brand brand, int productId);
}

