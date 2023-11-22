package day37_a_abstraction.Exercise;

public abstract class Exercise {

    String name;

    public Exercise (String name) {
        this.name = name;
    }

    public abstract void performExercise();

    public abstract int caloriesBurned (int mim);

public void generalInfo(){
    System.out.println("Exercise if better for your health");
}
}
