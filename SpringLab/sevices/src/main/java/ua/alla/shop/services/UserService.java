package ua.alla.shop.services;

import ua.alla.shop.services.dto.UserDto;

import java.util.List;

public interface UserService {

    void create(UserDto user);

    List<UserDto> findAll();

}
