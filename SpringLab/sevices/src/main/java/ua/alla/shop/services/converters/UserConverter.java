package ua.alla.shop.services.converters;

import ua.alla.shop.dao.model.User;
import ua.alla.shop.services.dto.UserDto;

public interface UserConverter {

    User toEntity(UserDto dto);

    UserDto toDto(User entity);
}
