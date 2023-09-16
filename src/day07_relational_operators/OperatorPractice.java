package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int num = 10;
        num++; // post increment | no other code , just incrementented by 1|
        System.out.println(num);  // 11


        num--; // post decremented
        System.out.println(); // 10

        System.out.println(num++); //post increment --> 10 , we get /print the value first , then we update it.
        System.out.println(num++); // output --> 11   | num=12 ;

        System.out.println(++num); // ---> pre increment - we update first then use it ___> num = 13; | and then print
        System.out.println(num);

    }
}
