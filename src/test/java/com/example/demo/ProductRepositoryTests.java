package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepositoryTests {
    @Autowired
    private ProductRepository productRepository;
    @Test
    public void saveProductTest()
    {
        Product product= Product.builder()
                .id(4)
                .name("Television")
                .price(1000.00)
                .quantity(8)
                .build();
        productRepository.save(product);

        Assertions.assertThat(product.getId()).isGreaterThan(0);
    }
    @Test
    public void getProductsTest()
    {
        Product product=productRepository.findById(8).get();
        Assertions.assertThat(product.getId()).isEqualTo(8);


    }
}
