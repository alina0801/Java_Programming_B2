package day36_inheritance.hiding;

public class B extends A {


    // this overriding method
    public void instanceMethod () {
    staticMethod();
    }

//static methods we cant hike but we can override

    //no overriding because its static method
    public static void staticMethod() {
        System.out.println("Static from Child");
    }
}
