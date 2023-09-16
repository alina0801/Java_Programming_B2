package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {


        // in java you can't store fractions 3/4 == 0.75

        // 0.75 --- 3/4 <-- In Jva you canNOT store fractions like this way

        float average = 0.45555F;

        double price = 3.9999999;


        int denysGlassPrice = 0;
        int feyruzGlassPrice = denysGlassPrice;

        System.out.println("Denys's class price is: " + denysGlassPrice);
        System.out.println("Feyruz's class price is: " + feyruzGlassPrice);




        System.out.println(3/4); // 0.75 it will show only 0
        System.out.println(5/2); // 1,5 it will show only 1



    }
}
