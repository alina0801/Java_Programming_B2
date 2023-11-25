package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {
        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Programming";
        book1.size = 20;
        book1.isFun = true;

        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextBook();
        book2.name = "Java P-2";
        book2.size = 30.5;
       // book2.isFun = false; EBook reference does NOT have access

        //I  know that we have limited the access with the reference side, BUT for just one quick step, I need to have access IsFun variable

        ((JavaTextBook)book2).isFun = false;       // casting reference from the parent
        //EBook to the child reference of JavaTextBook and that allows us to access the variable

        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextBook();
        book3.name = "Java P-3";
        // book3.size = 40.5;
        // book3.isFun = true;
        book3.read();
        //book3.open();
        //book3.download();
        // Book reference only has access to the name variable and the read() method


        //#3 Interface reference

        Downloadable book4 = new JavaTextBook();
        //book4.name = "Java P-4";
        //book4.size = 20;
        //book4.isFun = true;

        //book4.read();
        //book4.open();
        //book4.download(); -->  The only thing I will have access is downloadable() method which is in Downloadable interface same as the reference type

        JavaTextBook book5 = (JavaTextBook) book4;  // creating new reference . cast it , so we don't need to create a new object and take extra space

        //JavaTextBook book5 = (JavaTextBook)book4;
        //JavaTextBook book6 =  new JavaTextBook();
        // You do tno want to create more objects because of the memory.
        // That is why most of the time, people use casting is the there is IS-A relation
        book5.read();
        book5.open();
        book5.download();


        // Don't think that you have changed the reference of book4
        //book4.read();

    }
}
