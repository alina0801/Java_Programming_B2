package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int h = 5; //i declare an int variable called h and assign a value 5 to it
        int p = h; // I declared an int variable called p and assign a value from variable h.

        h++; // post increment - no other code just increase by 1

        System.out.println(h); // output 6
        System.out.println(p); //output: 5

        p=h; // will be 6
        System.out.println(p); // will be 6

        int k = h++;
        System.out.println("h:" + h); // h:7
        System.out.println("k: " +k); //k:6

        int g = ++h;
        System.out.println("h: " + h); // h=8
        System.out.println("g:" + g); //g=8

    }
}
