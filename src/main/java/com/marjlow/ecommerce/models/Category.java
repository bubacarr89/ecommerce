package com.marjlow.ecommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ProductCategory")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long CategoryId;
    private String CategoryName;
    private String Description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> CategoryProducts;

    public Category() { }
    public Category(String name, String description, List<Product> products) {
        CategoryName = name;
        this.Description = description;
        CategoryProducts = products;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        this.CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public List<Product> getCategoryProducts() {
        return CategoryProducts;
    }

    public void setCategoryProducts(List<Product> categoryProducts) {
        this.CategoryProducts = categoryProducts;
    }
}
