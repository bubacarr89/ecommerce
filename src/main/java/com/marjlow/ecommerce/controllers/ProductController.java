package com.marjlow.ecommerce.controllers;

import com.marjlow.ecommerce.models.Product;
import com.marjlow.ecommerce.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @GetMapping("/home")
    public @ResponseBody Iterable<Product> getProducts() {
        return productServices.getAllProducts();
    }

    @PostMapping("/new_product")
    public @ResponseBody String addProduct(@RequestBody Product product) {
        String message = productServices.addNewProduct(product);
        if(message.equals("success")) return "The product is successfully added";
        else {
            return "The product is not added, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @PostMapping("/new_multiple_product")
    public @ResponseBody String addMultipleProduct(@RequestBody Iterable<Product> products) {
        String message = productServices.addMultipleProduct(products);
        if(message.equals("success")) return "The products are successfully added";
        else {
            return "The products are not added, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @PostMapping("/delete_product")
    public @ResponseBody String removeProduct(@RequestParam String name, @RequestParam double price) {
        String message = productServices.deleteProduct(name, price);
        if(message.equals("success")) return "The product is successfully deleted";
        else {
            return "The product is not deleted, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @PostMapping("/product_count")
    public @ResponseBody String changeProductCount(@RequestParam String name, @RequestParam double price,
                                                   @RequestParam int count) {
        String message = productServices.changeProductCount(name, price, count);
        if(message.equals("success")) return "The product count is successfully changed";
        else {
            return "The product count is not changed, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @PostMapping("/change_price")
    public @ResponseBody String changeProductPrice(@RequestParam String name, @RequestParam double price,
                                                   @RequestParam double newPrice) {
        String message = productServices.changeProductPrice(name, price, newPrice);
        if(message.equals("success")) return "The product price is successfully changed";
        else {
            return "The product price is not changed, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @GetMapping("/get_product")
    public @ResponseBody Product findProduct(@RequestParam String name) {
        return productServices.findProduct(name);
    }
}
