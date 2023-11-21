package day32_custom_classes;

public class Offer {
    //5 instanse variables: company, location, salary, isFullTime, numberOfPTO

    String company, location;
    double salary;
    boolean isFullTime;
            int numPTO;

            //create  a constructor with two parameters - company and location

    public Offer  (String company, String location) {
        this.company = company;
        this.location = location;

    }
    //create a constructor with all parameters - company ,location , salary, isFullTime , numberOfPto


    public Offer(String company, String location, double salary, boolean isFullTime, int numPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numPTO = numPTO;
    }

    public String toString ()  {
        return company + "located in " + location +
                "\nPays $" + salary + "salary and provides " +  numPTO + " number of PTO" +
                "This is full time position: " + isFullTime; //boolean will be false , all others default


    }
}
