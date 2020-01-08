package com.marjlow.ecommerce.models;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "ProductDiscounts")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long DiscountId;
    @OneToOne
    private Product Product;
    private int DiscountPercentage;
    private double DiscountPrice;
    private double UpdatedPrice;
    private Date DiscountDate;

    public Discount() { }

    public long getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(long discountId) {
        DiscountId = discountId;
    }

    public com.marjlow.ecommerce.models.Product getProduct() {
        return Product;
    }

    public void setProduct(com.marjlow.ecommerce.models.Product product) {
        Product = product;
    }

    public int getDiscountPercentage() {
        return DiscountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        DiscountPercentage = discountPercentage;
    }

    public double getDiscountPrice() {
        return DiscountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        DiscountPrice = discountPrice;
    }

    public double getUpdatedPrice() {
        return UpdatedPrice;
    }

    public void setUpdatedPrice(double updatedPrice) {
        UpdatedPrice = updatedPrice;
    }

    public Date getDiscountDate() {
        return DiscountDate;
    }

    public void setDiscountDate(Date discountDate) {
        DiscountDate = discountDate;
    }
}
