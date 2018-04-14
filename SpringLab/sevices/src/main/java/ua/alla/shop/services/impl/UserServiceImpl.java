package ua.alla.shop.services.impl;

import ua.alla.shop.dao.repository.UserDao;
import ua.alla.shop.services.UserService;
import ua.alla.shop.services.dto.UserDto;

public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(UserDto user) {

    }
}
