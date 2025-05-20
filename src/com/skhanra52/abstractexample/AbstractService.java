package com.skhanra52.abstractexample;

import java.util.List;

public class AbstractService {

    public static void addItemToOrder(List<OrderItem> orderItems) {
        orderItems.add(new OrderItem("Mango", 6));
        orderItems.add(new OrderItem("Cabbage", 2));
        orderItems.add(new OrderItem("Cauliflower", 1));
    }

    public static void printOrderItems(ProductForSale productStore, List<OrderItem> orderItems){
        for(var product : orderItems){
            productStore.printPricedItem(product.quantity);
            System.out.println(
                    "Price - "+productStore.getSalesPrice(product.quantity));
        }
    }
}
