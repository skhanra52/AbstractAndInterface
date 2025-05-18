import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductForSale> productsForSale = new ArrayList<>();
    private List<OrderItem> orderItems = new ArrayList<>();
    public static void main(String[] args) {
        Store store = new Store();
        ProductForSale productStore = new OrganicItem("Mango","Organic","naturally grown", 5000);
        store.productsForSale.add(productStore);
        productStore = new OrganicItem("Apple","Organic","naturally grown", 5000);
        store.productsForSale.add(productStore);
        productStore = new HybridItem("cauliflower","Hybrid","Artificially grown", 2000);
        store.productsForSale.add(productStore);
        productStore = new HybridItem("Cabbage","Hybrid","Artificially grown", 2000);
        store.productsForSale.add(productStore);
        productStore = new HybridItem("Banana","Hybrid","Artificially grown", 2000);
        store.productsForSale.add(productStore);
        System.out.println("Products available for sale:");
        for(var availableProduct: store.productsForSale){
            availableProduct.showDetails(availableProduct);
        }
        System.out.println("Order items");
        store.addOrderedItemInList(new OrderItem("Mango", 6));
        store.addOrderedItemInList(new OrderItem("Cabbage", 2));
        store.addOrderedItemInList(new OrderItem("Cauliflower", 1));
        store.printOrderItems(productStore);


    }

    public void addOrderedItemInList(OrderItem item){
        orderItems.add(item);
    }

    public void printOrderItems(ProductForSale productStore){
        ArrayList<OrderItem> saleItems = new ArrayList<>(orderItems);
        for(var product : saleItems){
            System.out.println("Product Name - "+product.productName+ ", " +
                    "Order qty - "+product.quantity+ ", " +
                    "Price - "+productStore.getSalesPrice(product.quantity));
        }
    }
}

class OrganicItem extends ProductForSale{
    public OrganicItem(){};
    public OrganicItem(String name, String type, String description, int price) {
        super(name, type, description, price);
    }

    @Override
    public void showDetails(ProductForSale productForSale) {
        System.out.println("Product name: "+productForSale.name+", " +
                "Product Type: "+productForSale.type+ ", " +
                "Product description: "
                +productForSale.description);
    }
}

class HybridItem extends ProductForSale{
    public HybridItem(){};
    public HybridItem(String name, String type, String description, int price) {
        super(name, type, description, price);
    }

    @Override
    public void showDetails(ProductForSale productForSale) {
        System.out.println("Product name: "+productForSale.name+
                ", Product Type: "+productForSale.type+
                ", Product description: "+productForSale.description);
    }
}