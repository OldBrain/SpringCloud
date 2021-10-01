package ru.avbugorov.productservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.avbugorov.productservice.dtos.ProductDto;
import ru.avbugorov.productservice.model.Product;
import ru.avbugorov.productservice.repositories.ProductRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductDto> findAll() {
        List<ProductDto> listProductDto = new LinkedList<>();
        for (Product p: productRepository.findAll()) {
            listProductDto.add(new ProductDto(p));
        }
        return listProductDto;
    }
}
