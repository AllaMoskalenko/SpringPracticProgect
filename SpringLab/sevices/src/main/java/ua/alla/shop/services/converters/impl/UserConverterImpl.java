package ua.alla.shop.services.converters.impl;

import org.springframework.stereotype.Component;
import ua.alla.shop.dao.model.User;
import ua.alla.shop.services.converters.UserConverter;
import ua.alla.shop.services.dto.UserDto;

@Component
public class UserConverterImpl implements UserConverter {

    public User toEntity(UserDto dto) {
        return new User(null,
                dto.getFirstName(),
                dto.getLastName(),
                dto.getAge());
    }

    public UserDto toDto(User entity) {
        return new UserDto(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getAge());
    }
}
