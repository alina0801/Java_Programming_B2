package day39_a_polymorphism.animal;

public class Lizard extends Reptile {

    //instance variable
            String skinColor;
                @Override
            public void eat () {    //overriding here you cant change it for private , should be the same as from previous
                    System.out.println("LIZARD is eating");
            }

}
