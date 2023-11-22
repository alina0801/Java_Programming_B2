package day36_inheritance.hiding;

public class A {


    // this overriding method
    public void instanceMethod () {
        staticMethod();
    }

    //no overriding because its static method
    public static void staticMethod() {
        System.out.println("Static from Parent");

    }
}
