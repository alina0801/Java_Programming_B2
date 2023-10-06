package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;
        int attemptCount = 1;

        System.out.println("Welcome to ATM!");
        do {
            System.out.print("Enter your pin: ");
            userPin = input.nextInt(); // attempt
            attemptCount++;

            if (userPin != validPin) {
                System.out.println("It was invalid pin. Try again.");
                if (attemptCount == 3) {
                    System.out.println("This is last attempt");
                }
            }

        } while (userPin != validPin   &&  attemptCount <= 3  );


        if (userPin == validPin) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("LOCKED OUT");
        }





    }

}