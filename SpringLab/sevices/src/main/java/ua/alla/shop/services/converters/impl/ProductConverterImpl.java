package ua.alla.shop.services.converters.impl;

import org.springframework.stereotype.Component;
import ua.alla.shop.dao.model.Product;
import ua.alla.shop.services.converters.ProductConverter;
import ua.alla.shop.services.dto.ProductDto;

@Component
public class ProductConverterImpl implements ProductConverter {

    public Product toEntity(ProductDto dto) {

        Product.Gender gender1 = Product.Gender.valueOf(dto.getGender());
        Product.Color color1 = Product.Color.valueOf(dto.getColor());
        Product.Size size1 = Product.Size.valueOf(dto.getSize());

        return new Product(null,
                dto.getName(),
                dto.getPrice(),
                gender1,
                color1,
                size1,
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
