package ua.alla.shop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.alla.shop.dao.model.User;
import ua.alla.shop.dao.repository.UserDao;
import ua.alla.shop.services.UserService;
import ua.alla.shop.services.converters.UserConverter;
import ua.alla.shop.services.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    private final UserConverter userConverter;

    @Autowired
    public UserServiceImpl(UserDao userDao, UserConverter userConverter) {
        this.userDao = userDao;
        this.userConverter = userConverter;
    }

    public List<UserDto> findAll() {
        List<User> users = userDao.findAll();

        List<UserDto> userDtos = new ArrayList<UserDto>();

        for(User user: users){
            UserDto dto = userConverter.toDto(user);
            userDtos.add(dto);
        }
        return userDtos;
    }

    public void create(UserDto user) {
        User userEntity = userConverter.toEntity(user);
        userDao.create(userEntity);

    }
}
