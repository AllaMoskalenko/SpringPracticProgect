package ua.alla.shop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.alla.shop.dao.model.Product;
import ua.alla.shop.dao.repository.ProductDao;
import ua.alla.shop.services.ProductService;
import ua.alla.shop.services.converters.ProductConverter;
import ua.alla.shop.services.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final ProductConverter productConverter;

    @Autowired
    public ProductServiceImpl(ProductDao productDao, ProductConverter productConverter) {
        this.productDao = productDao;
        this.productConverter = productConverter;
    }

    public void create(ProductDto prod) {
        Product productEntity = productConverter.toEntity(prod);
        productDao.create(productEntity);
    }

    public List<ProductDto> findAll() {
        List <Product> products = productDao.findAll();
        List<ProductDto> productDtos = new ArrayList<ProductDto>();

        for (Product product: products){
            ProductDto dto = productConverter.toDto(product);
            productDtos.add(dto);
        }

        return productDtos;
    }
}
