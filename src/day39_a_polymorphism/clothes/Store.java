package day39_a_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        //ALL POSSIBLE REFERENCES

        // #1 - reference ITSELF
        TShirt tShirt1 = new TShirt();
        tShirt1.wear();

        // #2 - reference is SUPER (which is abstract class)

        Clothes tShirt2 = new TShirt();
        tShirt2.wear();

        //int a = 4;    you cant have the same
        //double a = 5;    you need to create a new one , the same concept

        //Object class
        Object tShirt3 = new TShirt(); // will run overridden version
        // tShirt3.wear();   -> you cant run it , Object class does not have reference to the wear() method


        // HasHood tShirt4 = new TShirt();

        // TShirt class does not implement HasHood interface, TShirt class doesn't have any relation
        // That's why it cannot a reference


        System.out.println("*******************************");

        //object reference cannot access variables and methods from the subclasses

        //All possible references FOR JACKET

        // #1 - ITSELF

        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        // #2 - Super Class
        
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //jacket2.putOnHood();
        //Clothes reference does NOT have access to putOnHood(); method.

        //#3 - Interface
        HasHood jacket3 = new Jacket();
        //jacket3.wear();
        // HasHood reference does NOT have access/visibility to wear();

        jacket3.putOnHood();


        Object jacket4 = new Jacket();
        //jacket4.wear();
        //jacket4.putOnHood();
        //Object class does NOT have reference to wear() and putOnHood() methods

        System.out.println();
        buy(tShirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());


        //since my method main is static we need to use static
        buy(tShirt1);
        buy(jacket1);

        String str = new String("Hello");
        buy2(str);
    }
    public static void buy2(String str) {
        System.out.println();
    }

    public static void buy(TShirt tShirt) {
        System.out.println();
    }
   // public static void buy(Clothes tShirt){  --> its common super class for two -> buy(tShirt); buy(jacket1);

    public static void buy(Clothes clothes){

        if (clothes instanceof TShirt) {
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket){
            System.out.println("Bough Jacket");
        }

    }
}



