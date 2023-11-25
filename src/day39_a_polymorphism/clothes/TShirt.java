package day39_a_polymorphism.clothes;
// concrete class, first non-abstract class
public class TShirt extends Clothes {
    // you need to override
    @Override
    public void wear(){
        // here is the implementation of the method

        System.out.println("Wearing a t-shirt");
    }
}
