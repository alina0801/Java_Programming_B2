package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        //reference       //object
//price = 4.99 (this instanse belongs to object

        coffee1.price = 4.99;
        coffee1.size = 16; //type promotion --> double can hold int
        coffee1.brand = "Lavazza";
        coffee1.type = "Americano";

        System.out.println(coffee1); // for now output defaut

        coffee1.drink();
        coffee1.refill(2); // you need to provide the argument , otherwise overloading
        coffee1.refill(4);

        System.out.println(coffee1);
    }
}
