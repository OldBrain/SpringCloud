package ru.avbugorov.frontservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GreetingControllerImpl {
    private final GreetingController greetingClient;

    @RequestMapping("/get-greeting")
    public String greeting() {
//      System.out.println(greetingClient.getClass().getName());
//      String answer = greetingClient.greeting();
        String answer = greetingClient.parametrized("1000");
        return answer;
    }
    @RequestMapping("/get-products")
    public List<Object> getProducts() {
        return greetingClient.getProducts();
    }
}
