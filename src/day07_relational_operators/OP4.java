package day07_relational_operators;

public class OP4 {
    public static void main(String[] args) {


        int t = 100; // -101 ; -100; -101; 100
     //                 -100    -101
    //           (-101 * -101 /-100 + 100) =
        int p = - ++t * -t-- / t++ + --t;;
        System.out.println(p);
        System.out.println(t); //100


        int c = 10201 % 100;


    }
}
