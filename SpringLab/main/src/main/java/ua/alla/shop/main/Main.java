package ua.alla.shop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ua.alla.shop.services.UserService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("context-main.xml");
        context.getBean(UserService.class);
    }
}
