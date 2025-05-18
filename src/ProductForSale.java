public abstract  class ProductForSale {

    protected String name;
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String name, String type, String description, int price){
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty){
        return qty * price;
    }

    public void printPricedItem(double qty){

        System.out.println("Product Name - "+name+ ", " +
                "Order qty - "+qty+ ", ");
//        System.out.println("Item type: "+ type+", "+description +", item available for sale: " +qty );
//        System.out.printf("%S qty at $%8.2f each, %-15s %35s %n", qty, price, type, description);
    }

    public abstract void showDetails();

}
