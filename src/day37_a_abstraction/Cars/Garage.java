package day37_a_abstraction.Cars;

public class Garage {
    public static void main(String[] args) {

        //abstract class can't have object
        //car class is abstract
        //Car obj = new Car();
        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        //The first non-abstract child classes are called CONCRETE classes
   Tesla obj4 = new Tesla();
   obj4.start(); //defined in car class
   obj4.charge(); //defined in electric class

        // Tesla is first NON-ABSTRACT class which has to implement
        // all the abstract methods that is coming from parent or grandparent
        // and In Tesla, we MUST override all those abstract methods.

    }
}
