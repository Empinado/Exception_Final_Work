package homework_Exception.hw_3;

public class Product {

    protected String name;
    protected int availableQuantity;
    protected double price;

    // public static int id = 0;

    // static int counter = 0;

    // {
    //     id = ++counter;
    // }

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    // public int getId(){
    //     return id;
    // }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product {" + "Name: " + name + "| Available Quantity: " + availableQuantity + "| Price: " + price + "}";
    }

}
