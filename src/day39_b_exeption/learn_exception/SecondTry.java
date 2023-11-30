package day39_b_exeption.learn_exception;

public class SecondTry  {
    public static void main(String[] args) {

    try {
        String s = "java";
        s = null;

        System.out.println(s.length()); // null.length();  -- null pointer exception --> it happens whenever you run

        int [] nums = {2, 43, 56, 2};
        //System.out.println(nums[7]); //ArrayIndexOutOfBounds  --- >>> Unchecked , Runtime  Exception

    } catch (NullPointerException e) {
        System.out.println("Caught a null pointer exception");
    }               catch (ArrayIndexOutOfBoundsException e)  {
        System.out.println("Caught a code an Array index out of Bonds exception");
    }

    //Exception e = new Exception();

    System.out.println("Done");


    /**Parent Exception class cannot be before the child Exception class*/
        /*
                try {
            String s = "java";
            s = null;
            System.out.println(s.length()); // null.length();

            int [] nums = {2, 43, 56, 2};
            System.out.println(nums[7]);  //ArrayIndexOutOfBoundsException


        }catch (Exception e) {
            System.out.println("Parent exception");
        }
        catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an Array index out of Bonds exception");
        }


         */




}

}

