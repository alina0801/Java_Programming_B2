package day40_exception;
/**
 * Parent class cannot be before the child class
 */
public class TryWithInInheritance {
    public static void main(String[] args) {
        try{

        } catch (IndexOutOfBoundsException e) {
        }catch (RuntimeException e) {   //parent
        }catch (Exception e)  {         //parent

            

        }
        // Possible reference for IndexOutOfBoundsException object

        // !!! polymorphism
    }  IndexOutOfBoundsException e = new IndexOutOfBoundsException();
    RuntimeException e2 = new IndexOutOfBoundsException();
    Exception e3 = new IndexOutOfBoundsException();
}
