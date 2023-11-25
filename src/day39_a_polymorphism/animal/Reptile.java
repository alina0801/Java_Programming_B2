package day39_a_polymorphism.animal;

public class Reptile extends Animal {

    // instance variable

   // String skinColor;

    int numberOfClaws;

    @Override
    public void eat() {
        super.eat();
        System.out.println("REPTILE is eating");
    }
}
