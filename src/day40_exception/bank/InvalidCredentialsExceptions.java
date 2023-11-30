package day40_exception.bank;

public class InvalidCredentialsExceptions extends Exception{

    public InvalidCredentialsExceptions (String message)   {
          super(message); //compile time exception
    }
}
