package day35_inheritance.book;
//audiobook is a book
public class AudioBook extends Book {
   // String title; (local)
    double duration; // mins
    String narrator;

    public void listen() {
        System.out.println("Listening to " + title + " narrated by " + narrator);

    }
}
