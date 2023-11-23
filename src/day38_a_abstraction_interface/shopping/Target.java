package day38_a_abstraction_interface.shopping;
//This is the first NON-ABSTRACT class /CONCRETE class
//WE must override/implement all the abstract methods coming from the parent class
public class Target extends Shopping {

    @Override
    public void buyItem() {
        System.out.println("Buying from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");

    }
}
