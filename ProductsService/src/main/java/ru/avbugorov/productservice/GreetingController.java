package ru.avbugorov.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.avbugorov.productservice.dtos.ProductDto;

import java.util.List;

public interface GreetingController {
    @GetMapping("/products")
    List<ProductDto> products();

}
