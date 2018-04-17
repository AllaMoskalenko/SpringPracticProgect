package ua.alla.shop.dao.repository;

import ua.alla.shop.dao.model.Product;

import java.util.List;

public interface ProductDao {

    void create (Product product);

    List<Product> findAll();
}
