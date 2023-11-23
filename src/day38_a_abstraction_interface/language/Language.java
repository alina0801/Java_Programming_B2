package day38_a_abstraction_interface.language;

public interface Language {

    String PLANET = "EARTH"; // it's not an instance variable --> when capital letters CONSTANT --> they will be public static final, by default

    void hi ();  // by default, I have "public abstract" at the beginning

    void bye ();   //"public abstract" is at the beginning
}
