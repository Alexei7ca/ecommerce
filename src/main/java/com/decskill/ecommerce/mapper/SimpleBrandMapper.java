package com.decskill.ecommerce.mapper;


import com.decskill.ecommerce.domain.Brand;
import com.decskill.ecommerce.dto.BrandDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleBrandMapper {

    BrandDto brandToBrandDto(Brand brand);

    Brand brandDtoToBrand(BrandDto brandDto);
}
