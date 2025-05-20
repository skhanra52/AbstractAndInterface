package com.skhanra52.abstractexample;

public class OrderItem {

    public int quantity;
    public String productName;

    public OrderItem(String productName,int quantity){
        this.productName = productName;
        this.quantity = quantity;
    }
}
