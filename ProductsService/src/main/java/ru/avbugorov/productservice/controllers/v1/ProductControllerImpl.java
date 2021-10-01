package ru.avbugorov.productservice.controllers.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import ru.avbugorov.productservice.GreetingController;
import ru.avbugorov.productservice.dtos.ProductDto;
import ru.avbugorov.productservice.services.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductControllerImpl implements GreetingController {

    private final ProductService productService;

    @Override
    @GetMapping("/products")
    public List<ProductDto> products() {
        return productService.findAll();
    }

}






