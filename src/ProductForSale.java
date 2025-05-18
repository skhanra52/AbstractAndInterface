public abstract  class ProductForSale {

    public String name;
    public String type;
    public int price;
    public String description;

    public ProductForSale(){}

    public ProductForSale(String name, String type, String description, int price){
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.println("Item type: "+ type+", "+description +", item available for sale: " +quantity );
    }

    public abstract void showDetails(ProductForSale productForSale);

}
