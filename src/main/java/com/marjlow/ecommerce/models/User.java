package com.marjlow.ecommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Customers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long UserId;
    private String username;
    private String Email;
    private String Password;
    private String Address;
    private String City;
    private String State;
    @OneToMany
    private List<Order> CustomerOrders;
    @OneToMany(fetch = FetchType.LAZY)
    private List<ProductFeedback> feedbacks;

    public User() { }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() { return Address; }

    public void setAddress(String address) { Address = address; }

    public String getCity() { return City; }

    public void setCity(String city) { City = city; }

    public String getState() { return State; }

    public void setState(String state) { State = state; }

    public List<Order> getCustomerOrders() {
        return CustomerOrders;
    }

    public void setCustomerOrders(List<Order> customerOrders) {
        CustomerOrders = customerOrders;
    }

    public List<ProductFeedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<ProductFeedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}
