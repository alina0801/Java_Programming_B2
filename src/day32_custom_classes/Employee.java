package day32_custom_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;
    //

    //create a constructor with two parameters - name & job title
    public Employee (String name, String jobTitle) {
this.name = name;
        this.jobTitle = jobTitle;
    }
//create a constructor with four parameters - name jobTitle id salary

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    // @Override
   /* public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';

    */

    //create a method that say name is going into meeting

    public void toMeeting() {

        System.out.println(name + " is going into meeting.");
    }

        public String toString () { //explisetly
            String result = "Info about employee: " + name +
                    "\n\tid: " + id +
                    "\n\tJob Title: " + jobTitle +
                    "\n\tSalary: " + salary;
            return result;
    }
}
