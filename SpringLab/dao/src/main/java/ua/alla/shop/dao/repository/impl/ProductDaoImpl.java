package ua.alla.shop.dao.repository.impl;

import org.springframework.stereotype.Repository;
import ua.alla.shop.dao.model.Product;
import ua.alla.shop.dao.repository.ProductDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    private final Map<Long, Product> products = new HashMap<>();

    private static volatile long idGenerator = 1L;

    public Map<Long, Product> getProducts() {
        return products;
    }


    public void create(Product product) {
        product.setId(idGenerator++);
        products.put(product.getId(), product);

    }


    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
}
