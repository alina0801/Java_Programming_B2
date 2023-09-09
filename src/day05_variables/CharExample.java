package day05_variables;

public class CharExample {

    public static void main(String[] args) {
        //assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // 97 + 90 --> 187

        char letterThreee = 65;
        System.out.println(letterThreee); // char letterFour = '65' invalid because there are two characters
        System.out.println(letterOne + letterTwo + letterThreee);

        System.out.println(letterOne + "" + letterTwo + "" + letterThreee);

        // concatenation
        System.out.println("chars : " + letterOne + letterTwo + letterThreee);

        //rule : concatenation starts from first string anything after first string is concatenated
        System.out.println(letterOne + letterTwo + "chars: " + letterThreee + numberOne);

        //concatenation
        System.out.println(letterOne + "chars: " + letterThreee + numberOne + "chars: " + letterOne + letterTwo);


    }
}
