package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        //default constructor , always should match
        Employee emp1 = new Employee("Nina", "Secret Agent" );
        //System.out.println(emp1.name);
       // System.out.println(emp1.jobTitle);
        System.out.println(emp1);

        Employee emp2 = new Employee("Nadir", 101, "SDET", 100_000 );
        System.out.println(emp2);

        emp1.toMeeting();
        emp2.toMeeting();
    }
}
