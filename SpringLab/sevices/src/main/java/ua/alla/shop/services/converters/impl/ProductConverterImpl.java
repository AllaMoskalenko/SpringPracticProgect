package ua.alla.shop.services.converters.impl;

import org.springframework.stereotype.Component;
import ua.alla.shop.dao.model.Product;
import ua.alla.shop.services.converters.ProductConverter;
import ua.alla.shop.services.dto.ProductDto;

@Component
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
