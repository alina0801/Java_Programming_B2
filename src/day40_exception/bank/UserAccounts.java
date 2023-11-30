package day40_exception.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne = new Bank();
        accountOne.balance = 100_000;


        try {
            accountOne.login("loopcamp", "12343243!@");
        } catch (InvalidCredentialsExceptions e) {
            System.out.println(e.getMessage());
        }

        try {
            accountOne.withdraw(120_000);
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }

        System.out.println("DONE");

    }


}