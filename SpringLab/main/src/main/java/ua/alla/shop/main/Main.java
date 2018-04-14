package ua.alla.shop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ua.alla.shop.dao.repository.impl.UserDaoImpl;
import ua.alla.shop.services.UserService;
import ua.alla.shop.services.dto.UserDto;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("context-main.xml");
        UserService userService = context.getBean(UserService.class);

        UserDto dto = new UserDto(args[0], args[1], Integer.parseInt(args[2]));

        userService.create(dto);

        UserDaoImpl dao = context.getBean(UserDaoImpl.class);

        System.out.println(dao.getUsers().get(1L));

    }
}
