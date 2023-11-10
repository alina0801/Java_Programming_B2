package day32_custom_classes;

public class ChainExample {
    //int a =5 ; // this instance variable will run after constractors


    //this()
    //first constractor
    public ChainExample() {
        //this() should be always be the first , it cant call and contains itself , and cant be two in one method
        System.out.println("First");

    }
    public ChainExample(int i) { //(int i) is local variable to this constractor
        this(); // empty parantasis , will call the constructor with the same argument, this is to help up chain constructors/connect them
        System.out.println("Second");
    }

    public ChainExample (String str) {
        this(5);
        System.out.println("Third");
    }
}
