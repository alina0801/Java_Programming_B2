package day04_variables;

public class PrimitiveDataType {
    public static void main(String[] args) {

        byte age = 50; // I declared a variable called age which has int data type and number 50 is assigned
        System.out.println("50"); // hardcoded - means you need to change it manually

        System.out.println("age"); //dynamic here "age" is not a variable . it is just a word that we are printing
        System.out.println(age); //Dynamically - we are using age variable to make our code dynamic

        //byte age = 95; //in java , we cant declare same variable name more than once
        age = 100; // since we are not declaration it again , we can use the same variable name . it will real

        //byte age2= 950; // primitive data  type byte cannot hold 950 because it is out of the range that

        short year; // we just declared th variable
        year = 2023; // we assigned a value to year variable

        int adressNumber = 234235453;

        long bigNumber;
        bigNumber = 648576483695876L; // with long you have to use this syntax L/l in the end

        // long year ; even if you have a Different data type , you can not use the same variable name
    }
}
