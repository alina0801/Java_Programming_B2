package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        //int apples = 50;
        // int grapes = 100;
        // int bananas = 150;

        int apples = 50, grapes = 100, bananas = 150; //---> you can declare this in this way as well if all these three variables have the same data type

        System.out.println("This is how many apples we have " + apples);
        // + ---> plus sign here  is no Addition
        // it is concatenation --> [KON _ KATI _ NEYSHIN]

        System.out.println("grapes: " + grapes);
        System.out.println("bananas: " + bananas);

        System.out.println("i sold some apples - 20 apples sold");
        apples = 30; // reassigning apples to have value of 25
        System.out.println("Apples after i sold: " + apples);

        int price = 15;

        //  System.out.println("The price of my 25 apples is $20"); hard coded
        System.out.println("The price of my " + apples  + " apples is $" + price);
    }
}
