package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product)
    {
        return repository.save(product);
    }

    public List<Product> getProducts()
    {
        return repository.findAll();
    }

    public Product getProduct(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "Product removed !!" +id;
    }

    public Product updateProduct(Product product) {
        Product existProduct=repository.findById(product.getId()).orElse(null);
        existProduct.setName(product.getName());
        existProduct.setQuantity(product.getQuantity());
        existProduct.setPrice(product.getPrice());
        return repository.save(existProduct);
    }
}
