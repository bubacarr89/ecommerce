package com.marjlow.ecommerce.services;

import com.marjlow.ecommerce.dto.ProductRepository;
import com.marjlow.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    private ProductRepository productRepo;

    @Autowired
    public ProductServices(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public String addNewProduct(Product product) {
        String message = "success";
        try {
            productRepo.save(product);
        }
        catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public String addMultipleProduct(Iterable<Product> products) {
        String message = "success";
        try {
            productRepo.saveAll(products);
        }
        catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public String deleteProduct(String name, double price) {
        String message = "success";
        try {
            Product product = productRepo.findByNameAndPrice(name, price);
            productRepo.delete(product);
        }
        catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public String changeProductCount(String name, double price, int count) {
        String message = "success";
        try {
            Product product = productRepo.findByNameAndPrice(name, price);
            product.setProductCount(count);
        }
        catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public String changeProductPrice(String name, double price, double newPrice) {
        String message = "success";
        try {
            Product product = productRepo.findByNameAndPrice(name, price);
            product.setPrice(newPrice);
        }
        catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public Product findProduct(String name) {
        return productRepo.findByName(name);
    }

}
