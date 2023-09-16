package day08_scanner_logical_operators;

import java.util.Scanner; //java util
//java.lang
public class ScaneerIntro {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello"+ name);
        System.out.println("--------------------");

        Scanner input = new Scanner(System.in); //i create a Scanner object
        System.out.println("Please enter a number: ");
        //input.nextInt(); //78 i didnt assing anything
        int num = input.nextInt();
        System.out.println("If I add 3 to your number, it will be: " + (num +3));
    }
}
