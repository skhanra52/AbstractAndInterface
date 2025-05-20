package com.skhanra52.abstractexample;

public class OrganicItem extends ProductForSale{
    public OrganicItem(String name, String type, String description, int price) {
        super(name, type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+ " of item is usually very healthy.");
        System.out.println("Product name: "+name+", " +
                "Product Type: "+type+ ", " +
                "Product description: "
                +description);
    }
}