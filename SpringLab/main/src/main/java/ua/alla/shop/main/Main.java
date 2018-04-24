
package ua.alla.shop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ua.alla.shop.dao.model.Product;
import ua.alla.shop.dao.repository.impl.ProductDaoImpl;
import ua.alla.shop.dao.repository.impl.UserDaoImpl;
import ua.alla.shop.services.ProductService;
import ua.alla.shop.services.UserService;
import ua.alla.shop.services.dto.ProductDto;
import ua.alla.shop.services.dto.UserDto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        ApplicationContext context = new GenericXmlApplicationContext("context-main.xml");

        ProductService productService = context.getBean(ProductService.class);

        UserService userService = context.getBean(UserService.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            String[] arguments = input.split(" ");

            if ("U".equals(arguments[0])) {
                if ("C".equals(arguments[1])) {
                    UserDto dto = new UserDto(arguments[2],
                            arguments[3],
                            Integer.parseInt(arguments[4]));
                    userService.create(dto);
                    System.out.println("User has been successfully");
                } else if ("L".equals(arguments[1])) {
                    System.out.println("List of user:");
                    System.out.println(userService.findAll());
                }
            }

            if ("P".equals(arguments[0])) {
                if ("C".equals(arguments[1])) {
                    ProductDto dto1 = new ProductDto(arguments[2],
                            Integer.parseInt(arguments[3]),
                            arguments[4],
                            arguments[5],
                            Integer.parseInt(arguments[6]),
                            Integer.parseInt(arguments[7])
                    );
                    productService.create(dto1);
                    System.out.println("Poduct has been successfully");
                } else if ("L".equals(arguments[1])) {
                    System.out.println("List of products:");
                    System.out.println(productService.findAll());
                }
            }
        }
    }
}
        /*

        ProductDto dto = new ProductDto(args[0],
                Integer.parseInt(args[1]),
                args[2],
                args[3],
                Integer.parseInt(args[4]),
                Integer.parseInt(args[5]));

        productService.create(dto);

        ProductDaoImpl dao = context.getBean(ProductDaoImpl.class);

        System.out.println(dao.getProducts().get(1L));
*/






