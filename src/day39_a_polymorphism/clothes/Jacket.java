package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {

    @Override
    public void wear() {
        //public void wear(String wear) -> overloading
        // here is the implementation of the method

        System.out.println("Wearing a t-shirt");

    }
    @Override
    public void putOnHood() {
        System.out.println("Putting on the jacket hood");
    }
}
