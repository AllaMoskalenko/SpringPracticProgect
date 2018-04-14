package ua.alla.shop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ua.alla.shop.dao.repository.impl.UserDaoImpl;
import ua.alla.shop.services.UserService;
import ua.alla.shop.services.dto.UserDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new GenericXmlApplicationContext("context-main.xml");
        UserService userService = context.getBean(UserService.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String input = reader.readLine();
            String[] arguments = input.split(" ");

            if ("C".equals(arguments[0])){
                UserDto dto = new UserDto(arguments[1], arguments[2], Integer.parseInt(arguments[3]));
                userService.create(dto);
                System.out.println("User has been successfully");
            }
            else if ("L".equals(arguments[0])){
                System.out.println("List of user:");
                System.out.println(userService.findAll());
            }
        }

/*


        UserDto dto = new UserDto(args[0], args[1], Integer.parseInt(args[2]));

        userService.create(dto);

        UserDaoImpl dao = context.getBean(UserDaoImpl.class);

        System.out.println(dao.getUsers().get(1L));
*/

    }
}
