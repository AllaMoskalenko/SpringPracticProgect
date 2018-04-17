package ua.alla.shop.services.converters.impl;

import ua.alla.shop.dao.model.Product;
import ua.alla.shop.services.converters.ProductConverter;
import ua.alla.shop.services.dto.ProductDto;

public class ProductConverterImpl implements ProductConverter {

    public Product toEntity(ProductDto dto) {
        return new Product(null,
                dto.getName(),
                dto.getPrice(),
                dto.getGender(),
                dto.getColor(),
                dto.getSize(),
                dto.getRemainder());
    }

    public ProductDto toDto(Product entity) {
        return new ProductDto(  entity.getName(),
                                entity.getPrice(),
                                entity.getGender(),
                                entity.getColor(),
                                entity.getSize(),
                                entity.getRemainder());
    }
}
