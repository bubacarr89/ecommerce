package com.marjlow.ecommerce.models;

import javax.persistence.*;

@Entity(name = "OrderItems")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long ItemId;
    @OneToOne
    private Product ItemName;
    private int ItemCount;

    public Items() { }

    public long getItemId() {
        return ItemId;
    }

    public void setItemId(long itemId) {
        ItemId = itemId;
    }

    public Product getItemName() {
        return ItemName;
    }

    public void setItemName(Product itemName) {
        ItemName = itemName;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }
}
