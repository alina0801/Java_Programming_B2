package day32_custom_classes;

public class TestChaining {
    public static void main(String[] args) {
//newChainExample - object, ChainExample - constructor
        // we declaring the object
        new ChainExample(); // no reference, if you want to reuse you need to assign the reference name , calling matching constractor from another class;
        // we assign the reference to the object: ChainExample one =  new ChainExample();
        new ChainExample();

        //    System.out.println(new ChainExample()); not the same as on line 6

        new ChainExample(5);

        new ChainExample("loopcamp");
    }
}