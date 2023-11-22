package day37_a_abstraction.Cars;

public abstract class Car {

    //method declaration with no body, cannot be static , can not be final , cant have private modifier,
    //a method with no body
    //what wil be done , but not how it will be done
    //you can have only in abstract class

    public abstract void start();
    //to force all the child classes to override and implement this ,method
    //they will have to implement all the abstract methods

    //public abstract void start();
}
