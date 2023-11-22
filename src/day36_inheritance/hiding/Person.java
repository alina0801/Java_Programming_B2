package day36_inheritance.hiding;

public class Person {
    String name = "Tom Jerry"; // default access modifier
}

class Child extends Person {
    //similar to static, all the variables inherited to child class
    // has variable with the same name , it will hide the one from parent.
    String name = "Mickey Mouse";
}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        System.out.println();

        Child child = new Child();
        System.out.println(child.name);

    }
}
