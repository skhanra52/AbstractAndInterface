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
        addItemToOrder(orderItems);
        printOrderItems(productStore);


    }

    public static void addItemToOrder(List<OrderItem> orderItems) {
        orderItems.add(new OrderItem("Mango", 6));
        orderItems.add(new OrderItem("Cabbage", 2));
        orderItems.add(new OrderItem("Cauliflower", 1));
    }


    public static void printOrderItems(ProductForSale productStore){
        ArrayList<OrderItem> saleItems = new ArrayList<>(orderItems);
        for(var product : saleItems){
            productStore.printPricedItem(product.quantity);
            System.out.println(
                    "Price - "+productStore.getSalesPrice(product.quantity));
        }
    }
}

class OrganicItem extends ProductForSale{
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

class HybridItem extends ProductForSale{
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