package day37_a_abstraction.Exercise;
//concrete class
public class Running extends Exercise {


    public Running() {
        super("Running");
    }

    public void performExercise() {
        System.out.println("Running on treadmill");
    }

  //  overloading not overriding
    //  public int caloriesBurned() {
      //  return 0;
   // }
@Override
    public int caloriesBurned(int min) {
    return min * 5;
}
@Override
    public void generalInfo() {
        System.out.println(name + " Exercise if better for your health");
    }
}