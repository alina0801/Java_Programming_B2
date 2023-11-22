package day37_a_abstraction.Cars;
//concrete class
// have to get implementation from Car (parent class) of the abstract method
public class Tesla extends ElectricCar {
@Override
    public void charge() {
        System.out.println("Charging Tesla");
    }

    @Override
    public void start() {
        System.out.println("Start remotly");
    }
}