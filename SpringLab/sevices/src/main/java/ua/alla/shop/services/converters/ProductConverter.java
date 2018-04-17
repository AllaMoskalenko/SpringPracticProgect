package ua.alla.shop.services.converters;

import ua.alla.shop.dao.model.Product;
import ua.alla.shop.services.dto.ProductDto;

public interface ProductConverter {

    Product toEntity(ProductDto dto);

    ProductDto toDto(Product entity);
}
