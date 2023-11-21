package day33_a_static;


import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopCampStudent student1 = new LoopCampStudent("Sergii", 3);
        System.out.println(student1);

        LoopCampStudent student2 = new LoopCampStudent("Nihad", 3);
        System.out.println(student2);


        System.out.println();
        LoopCampStudent.printInfo();

        // can you get me the just name of the teachers in this course
        System.out.println("Teachers Name: " + Arrays.toString(LoopCampStudent.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student1.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student2.teachers));




    }

}