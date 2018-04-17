package ua.alla.shop.services;

import ua.alla.shop.dao.model.Product;
import ua.alla.shop.services.dto.ProductDto;

import java.util.List;

public interface ProductService {

    void create (ProductDto prod);

    List<ProductDto> findAll();
}
