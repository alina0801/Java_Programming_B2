package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        // The following are about \t - tab
        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbed 1 time"); // this is tabbed 1 time
        System.out.println("    This is tabbed 1 time"); // 4 SPACE clicks
        System.out.println("\t\tThis is tabbed 1 time"); // this is tabbed 2 time

        // The following are about \n - new line
        System.out.println(""); // abzaz without n
        System.out.println("1) Go to store");
        System.out.println();


        System.out.println("1) Go to store");
        System.out.println("2) Grab milk");
        System.out.println("3) Pay cashier");


        System.out.println("\n1) Go to store\n2) Grab milk\n3) Pay cashier"); // abzaz with "\n" in a front

        

    }
}
