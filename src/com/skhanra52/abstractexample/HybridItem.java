package com.skhanra52.abstractexample;

public class HybridItem extends ProductForSale{
    public HybridItem(String name, String type, String description, int price) {
        super(name, type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+" item is really quick to grown and cost effective");
        System.out.println("Product name: "+name+
                ", Product Type: "+type+
                ", Product description: "+description);
    }
}