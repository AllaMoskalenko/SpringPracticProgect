package ua.alla.shop.dao.repository.impl;

import ua.alla.shop.dao.model.Product;
import ua.alla.shop.dao.repository.ProductDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {

    private final Map<Long, Product> products = new HashMap<>();

    private static volatile long idGenerator = 1L;

    public Map<Long, Product> getProducts() {
        return products;
    }

    @Override
    public void create(Product product) {
        product.setId(idGenerator++);
        products.put(product.getId(), product);

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
}
