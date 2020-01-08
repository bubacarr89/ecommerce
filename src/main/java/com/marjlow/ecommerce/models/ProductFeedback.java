package com.marjlow.ecommerce.models;

import javax.persistence.*;

@Entity
public class ProductFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long FeedbackId;
    @ManyToOne(fetch =  FetchType.LAZY)
    private User Customer;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product Product;
    private String feedback;
    private String feedbackSentiment;

    public ProductFeedback() { }

    public long getFeedbackId() {
        return FeedbackId;
    }

    public void setFeedbackId(long feedbackId) {
        FeedbackId = feedbackId;
    }

    public User getCustomer() {
        return Customer;
    }

    public void setCustomer(User customer) {
        Customer = customer;
    }

    public com.marjlow.ecommerce.models.Product getProduct() {
        return Product;
    }

    public void setProduct(com.marjlow.ecommerce.models.Product product) {
        Product = product;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedbackSentiment() {
        return feedbackSentiment;
    }

    public void setFeedbackSentiment(String feedbackSentiment) {
        this.feedbackSentiment = feedbackSentiment;
    }
}
