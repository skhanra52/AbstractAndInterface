package com.skhanra52;

import com.skhanra52.abstractexample.HybridItem;
import com.skhanra52.abstractexample.OrderItem;
import com.skhanra52.abstractexample.OrganicItem;
import com.skhanra52.abstractexample.ProductForSale;
import com.skhanra52.abstractexample.AbstractService;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<ProductForSale> productsForSale = new ArrayList<>();
    private static List<OrderItem> orderItems = new ArrayList<>();

    public static void main(String[] args) {

        ProductForSale productStore = new OrganicItem("Mango", "Organic", "naturally grown", 5000);
        productsForSale.add(productStore);
        productStore = new OrganicItem("Apple", "Organic", "naturally grown", 5000);
        productsForSale.add(productStore);
        productStore = new HybridItem("cauliflower", "Hybrid", "Artificially grown", 2000);
        productsForSale.add(productStore);
        productStore = new HybridItem("Cabbage", "Hybrid", "Artificially grown", 2000);
        productsForSale.add(productStore);
        productStore = new HybridItem("Banana", "Hybrid", "Artificially grown", 2000);
        productsForSale.add(productStore);
        System.out.println("Products available for sale:");
        for (var availableProduct : productsForSale) {
            availableProduct.showDetails();
        }
        System.out.println("Order items");
        AbstractService.addItemToOrder(orderItems);
        AbstractService.printOrderItems(productStore, orderItems);
    }

}