package com.decskill.ecommerce.service;

import com.decskill.ecommerce.domain.Brand;
import com.decskill.ecommerce.domain.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {
    List<Price> getAllPrices();

    Price getPriceById(Integer id);

    Price getPrice(LocalDateTime date, Brand brand, int productId);
}

