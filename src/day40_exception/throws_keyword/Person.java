package day40_exception.throws_keyword;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
       //  at work they want to throw exception
        // if (name.isEmpty()) {
       //     System.out.println("You cannot assign empty string");
       // }
       //same name parameters are different overloading
       //compiled you need to handle
        if (name.isEmpty() || name.equals(null)) {
            throw new Exception("You cannot assign empty string");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //boundary testing  --> testing aging cases --> how do you do that with array ? ---> index 0 and last index --> you are checking all the zip
        if (age < 0 || age > 120 ){
            //throw new RuntimeException();  // parent
            throw new IllegalArgumentException("Age should be more than 0 or less than 120"); //--> //child not matching your conditions
        }
        this.age = age;
    }
}
