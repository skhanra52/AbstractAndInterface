package com.skhanra52;

import com.skhanra52.abstractexample.*;
import com.skhanra52.interfaceexample.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<ProductForSale> productsForSale = new ArrayList<>();
    private static List<OrderItem> orderItems = new ArrayList<>();

    public static void main(String[] args) {

        //--------- Abstract Example ---------------------------------------------------------
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

        //-------------- Interface Example -----------------------------------------------

        System.out.println();
        System.out.println("-----------------Example of Interface begin here-----------------------");
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

//        animal.move();
//        flier.takeOff();
//        flier.fly();
//        flier.land();
//        tracked.track();
        /*
            Bird is the runtime object which contents all the methods from abstract class and
            implements interfaces force to implement methods.
            We can not call move() which is there in the Bird class using trackable reference
            because trackable is the reference type, and it does not know the move method of bird.
            "In short Child class (here it is Bird who extends parent classes) know parents methods
            if the type of reference variable is child class type, However, parent class does not know
            what is available inside child classes. (child know who is papa, papa does non know who is child)
            "
            that's why tracked.move() will give you compiler error.
         */

        inFlight(bird);
        inFlight(new Jet());

        Trackable track = new Track();
        tracked.track();

        //---------Main ends here----------------
    }

    public static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.transition(FlightStages.CRUISE);
        flier.fly();
        if(flier instanceof Trackable tracked){ // if the obj is a class that implements
                                                // trackable then local variable set as tracked
            tracked.track();
        }
        flier.land();
    }
}