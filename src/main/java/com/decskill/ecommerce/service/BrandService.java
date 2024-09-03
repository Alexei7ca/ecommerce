package com.decskill.ecommerce.service;

import com.decskill.ecommerce.domain.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAllBrands();

    Brand getBrandByName(String name);
}
