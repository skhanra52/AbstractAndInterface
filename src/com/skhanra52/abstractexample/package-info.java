package com.skhanra52.abstractexample;

/*
  Abstract class challenge:
   You need to build an application that can be storefront for any imaginable item for sale.
   Instead of Main
   class we usually create, a com.skhanra52.Store class with a main method.
   The com.skhanra52.Store class should:
   Manage a list of products for sale, including displaying the product details.
   Manage an order, which can just be a list of com.skhanra52.abstractexample.OrderItem objects.
   Have methods to add an item to the order, and print the orders items, so it looks like sales receipt.
   Also create a com.skhanra52.abstractexample.ProductForSale class that should have at least three fields: a type, price, and a description.
   This class should also have methods to:
   getSalesPrice, a concrete method, which takes a quantity, and returns the quantity times the price.
   printPricedItem, a concrete method, which takes a quantity, and should print an itemised line item for an order,
   with quantity and line-item price.
   showDetails, an abstract method, which represents what might be displayed on a product page. Product type,
   description, price, and so on.
   Also create a com.skhanra52.abstractexample.OrderItem type, that has at a minimum 2 fields:
   quantity and a product for sale.
   You should also create two or three classes that extend the com.skhanra52.abstractexample.ProductForSale class,
   that will be products in your store.
 */

