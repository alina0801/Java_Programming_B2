package day33_a_static;
//build the structure(built a templete, create the object and what that object will have) that I can make an object which will have 4 fields / instanse variables .
   /*         - name, lenght, artist, genre

Make a couple options for object creation
    - instantiating $name
    - instantiating $name, $length
    - instantiating $name, $length, artist
    - instantiating $name, $length, artist, genre
    MAke it possible to see the object info
    */
public class Song {
    //instanse variables
    String name;
    double length;
    String artist;
    String genre;


    //local varible
    public Song(String name) {
        this.name = name;//(this.name is a reference name for s1.name from use song )
    }

    public Song(String name, double length) {

        this(name);
        this.length = length;

    }
public Song (String name,double length, String artist) {
        this(name, length);
        this.artist = artist;
}

    public Song(String name, double length, String artist, String genre) {
        this(name,length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        //String lengthREsult = length != 0.0 ? length + "": "There is not length for this object";
        return "Song" +
                " \nname: " + name +
                ",\nlength: " + (length !=0.0 ? length: "There is not length for this object") +
                ", \nartist: " + artist +
                ", \ngenre: " + genre;
    }
}
