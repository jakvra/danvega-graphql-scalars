package dev.danvega.graphqlscalars.controller;

import dev.danvega.graphqlscalars.model.Product;
import dev.danvega.graphqlscalars.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @QueryMapping
    public List<Product> allProducts() {
        return repository.findAll();
    }
}
