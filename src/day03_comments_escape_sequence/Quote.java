package day03_comments_escape_sequence;

public class Quote {
    public static void main(String[] args) {

        /*
        Q: How can I output the following
        I like "Java" programming
         */

        System.out.println("I like \"Java\" programing");


        System.out.println("I like 'Java' programing");
        System.out.println("I like /Java/ programing");


        System.out.println("I like \\Java\\ programing");

        System.out.println("abc\\\\def");

        System.out.println("abc/def");

    }
}
