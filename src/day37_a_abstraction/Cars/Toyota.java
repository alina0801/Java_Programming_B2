package day37_a_abstraction.Cars;
//concrete class
public class Toyota extends Car {
    @Override
    public void start() {
        System.out.println("Insert KEY");
        System.out.println("Turn the KEY");
    }
}
