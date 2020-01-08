package com.marjlow.ecommerce.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "CustomerOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long OrderId;
    @OneToOne
    private User Customer;
    @OneToMany
    private List<Items> OrderItems;
    private double OrderAmount;
    private Date OrderDate;
    private String OrderStatus;
    private String OrderDelieveryStatus;
    public Date OrderDelieveryDate;
    private String OrderFeedback;

    public Order() { }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public User getCustomer() {
        return Customer;
    }

    public void setCustomer(User customer) {
        Customer = customer;
    }

    public List<Items> getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(List<Items> orderItems) {
        OrderItems = orderItems;
    }

    public double getOrderAmount() {
        return OrderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        OrderAmount = orderAmount;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getOrderDelieveryStatus() {
        return OrderDelieveryStatus;
    }

    public void setOrderDelieveryStatus(String orderDelieveryStatus) {
        OrderDelieveryStatus = orderDelieveryStatus;
    }

    public Date getOrderDelieveryDate() {
        return OrderDelieveryDate;
    }

    public void setOrderDelieveryDate(Date orderDelieveryDate) {
        OrderDelieveryDate = orderDelieveryDate;
    }

    public String getOrderFeedback() {
        return OrderFeedback;
    }

    public void setOrderFeedback(String orderFeedback) {
        OrderFeedback = orderFeedback;
    }
}
