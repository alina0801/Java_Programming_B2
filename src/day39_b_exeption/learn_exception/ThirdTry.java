package day39_b_exeption.learn_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the number 1: ");
            int num1 = input.nextInt();  // 5 mismatch exception could be if user can give me a String

            System.out.println("Enter the number 2: ");
            int num2 = input.nextInt(); // 2 | 0

            System.out.println("Division of num1 / num2 is equal: " + num1 / num2); //5/2 =2

       // If you have multiple catches : !!! exceptions from child to parent

        } catch (InputMismatchException obj) {
            obj.printStackTrace();
        } catch (ArithmeticException obj) {
            obj.printStackTrace();
        }  finally {      //last words - if you want something still run something before exception hits - its optional block
            System.out.println("FINALLY BLOCK");
            input.close();
        }

//        better to use 2*catch than do 2 try catch
//        try{
//            System.out.println("Division of num1 / num2 is equal: " + num1/num2); //5/2 =2
//        } catch (ArithmeticException obj) {
//            obj.printStackTrace();
//        }
            //Possibilities of exceptions:
                //1. InputMismatchException
                //2. ArithmeticException


            System.out.println("DONE");


    }
}
