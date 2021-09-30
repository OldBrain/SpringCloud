package ru.avbugorov.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingControllerImpl implements GreetingController {
    @Override
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello!";
    }

    @GetMapping("/abc")
    public void test() {
        System.out.println("ABC");
    }

    @GetMapping("/abcr")
    public String abcr() {
        return "ABCR";
    }

    @GetMapping("/parametrized/{id}")
    public String parametrized(@PathVariable(value = "id") String id) {
        if(10 < 100) {
            throw new RuntimeException();
        }
        return "echo: " + id;
    }
}
