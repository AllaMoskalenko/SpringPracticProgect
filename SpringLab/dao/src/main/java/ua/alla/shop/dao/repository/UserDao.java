package ua.alla.shop.dao.repository;

import ua.alla.shop.dao.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);

    List<User> findAll();
}
