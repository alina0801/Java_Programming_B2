package day33_a_static;

public class Food {
    // Instance variables /fields -> name, quantity, unitPrice, totalPrice

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    //contractors - (name), (name, quantity), (name, quantity, unitPrice)

    public Food (String name) {
        this.name = name;

    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
    }
    //method - > calculatePrice();
    public void calculatePrice() {
        totalPrice = unitPrice * quantity;
    }

    public String toString(){
        return "Info about The Fruit: " +
                "\n\tName: " + name +
                "\n\tQuantity: " + quantity +
                "\n\tUnit Price: " + unitPrice +
                "\n\tTotal Price: " + totalPrice;
    }
}
