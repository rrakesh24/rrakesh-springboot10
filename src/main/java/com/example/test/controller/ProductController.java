package com.example.test.controller;

import com.example.test.entity.Product;
import com.example.test.service.ProductService;
import com.example.test.entity.Product;
import com.example.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
   private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return  productService.getProducts();
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name)
    {
        return productService.getProductByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return productService.deleteProduct(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return productService.updateProduct(product);
    }
}
