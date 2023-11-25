package day39_a_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        //ALL POSSIBLE REFERENCES

        // #1 - REFERENCE is ITSELF -> same class
        Lizard lizard = new Lizard(); //calling overriding version from the child class, if not parent class will be called
        lizard.eat();               // calling method we have multilevel inheritance, Animal --> Repeatable --> Lizard

        //LIZARD has access to 3 instance variables

        lizard.name = "Lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);

        System.out.println("****************************************");

        new Lizard().name = "Test";         // when you have keyword new you're creating new object, purpose of references is re-usability we can assign and use it anywhere

        System.out.println(lizard.name);

        System.out.println("****************************************");

        // #2 - REFERENCE is SUPER CLASS --> Parent class

        Reptile reptile = new Lizard();       //object side will run always
        reptile.eat();
        reptile.name = "Reptile";              // belongs to animal
        reptile.numberOfClaws = 10;            // belong reptile
        //reptile.skinColor = "green";         // Reptile reference does not have access does not have access to skinColor variable
        //polymorphism restrict your access


        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
        //System.out.println(reptile.skinColor); -> Reptile reference does not have access to skinColor variable.

        System.out.println("****************************************");

        // #2 - REFERENCE is SUPER CLASS - > Parent class
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "animal";
        // animal.numberOfClaws = 10; -> Animal reference does not have access to numberOfClaws variable.
        //animal.skinColor = "camo"; -> Animal reference does not have access to skinColor variable.
        System.out.println(animal.name);
        // System.out.println(animal.numberOfClaws); -> Animal reference does not have access to numberOfClaws variable.
        //System.out.println(animal.skinColor);// -> Animal reference does not have access to skinColor variable.


        /*

        We made 3 Lizard objects with 3 different references.
                Lizard (ITSELF)
                Reptile (super class)
                Anima (super class)

            But when it comes to execution, the object implementation is the ine that runs.
        
         */

        System.out.println("****************************************");

        // #1 = Reference is ITSELF
        Reptile reptile2 = new Reptile();
        reptile2.eat();

        System.out.println("****************************************");

        // #2 - Reference is SUPER Class
        Animal animal2 = new Reptile();
        animal2.eat();


        /*
            Sample of Polymorphism from Automation classes:
                WebDriver driver = new ChromeDriver();
                ChromeDriver driver2  = new ChromeDriver();
         */
    }
}
