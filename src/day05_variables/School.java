package day05_variables;

public class School {
    /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
    public static void main(String[] args) {

        int numberOfStudentsInGrade1 = 32;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 25;
        int numberOfStudentsInGrade4 = 10;
        int numberOfStudentsInGrade5 = 38;

        // How can i calculate the total number of students?
        //int totalNumberOfStudents = 30 + 40 + 25 + 10 + 38;

        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;


        double numberOfDaysInAYear = 100.5;
        double numberOfSnowDaysInAYear = 10;
        double averageGPAInSchool = 3.5;


        System.out.println("number of students in grade 1: " + numberOfStudentsInGrade1);
        System.out.println("number of students in grade 2: " + numberOfStudentsInGrade2);
        System.out.println("number of students in grade 3: " + numberOfStudentsInGrade3);
        System.out.println("number of students in grade 4: " + numberOfStudentsInGrade4);
        System.out.println("number of students in grade 5: " + numberOfStudentsInGrade5);

       //System.out.println("Total Number of students " + numberOfStudentsInGrade1 + numberOfStudentsInGrade2); // this will concatenate
        System.out.println("Total Number Of Students: " + totalNumberOfStudents);

        System.out.println("Number days in a year: " + numberOfDaysInAYear);
        System.out.println("Number of snow days in a year: " + numberOfSnowDaysInAYear);
        System.out.println("The average GPA in school is: " + averageGPAInSchool);

    }
}
