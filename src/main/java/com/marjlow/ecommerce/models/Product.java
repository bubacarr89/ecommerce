package com.marjlow.ecommerce.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long ProductId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category Category;
    private String Name;
    private double Price;
    private String Description;
    private int ProductCount;
    private Date UploadDate;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Discount> ProductDiscounts;
    @OneToMany(fetch = FetchType.LAZY)
    private List<ProductFeedback> feedbacks;

    public Product() { }
    public Product(Category category, String name, double price, int count, Date upload_date) {
        Category = category;
        Name = name;
        Price = price;
        ProductCount = count;
        UploadDate = upload_date;
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public com.marjlow.ecommerce.models.Category getCategory() {
        return Category;
    }

    public void setCategory(com.marjlow.ecommerce.models.Category category) {
        Category = category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getProductCount() {
        return ProductCount;
    }

    public void setProductCount(int productCount) {
        ProductCount = productCount;
    }

    public Date getUploadDate() {
        return UploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        UploadDate = uploadDate;
    }

    public List<Discount> getProductDiscounts() {
        return ProductDiscounts;
    }

    public void setProductDiscounts(List<Discount> productDiscounts) {
        ProductDiscounts = productDiscounts;
    }

    public List<ProductFeedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<ProductFeedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}
