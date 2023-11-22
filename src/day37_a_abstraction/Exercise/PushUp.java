package day37_a_abstraction.Exercise;
//concrete clas
public class PushUp extends Exercise {

    public PushUp() {
        super("PushUp");
    }

    public void performExercise() {
        System.out.println("Doing push up on the floor");
    }

    @Override
    public int caloriesBurned(int min) {
        return min * 2;
    }
@Override
    public void generalInfo() {
        System.out.println(name + " Exercise if better for your health");
    }
}
