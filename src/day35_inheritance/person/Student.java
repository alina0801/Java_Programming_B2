package day35_inheritance.person;

public class Student extends Person {

    //right side parent left child
    //but using extends --> we have access what parent has in our case "person" --> super class --> whatever parent have child also have -- it inheritance to child

//    String name;
//    int age;
//    String favoriteHobby;

    char grades;

    public void study () {
        System.out.println(name + " is studying");
    }




    }

