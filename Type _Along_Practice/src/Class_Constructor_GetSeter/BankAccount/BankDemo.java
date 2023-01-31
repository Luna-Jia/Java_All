package Class_Constructor_GetSeter.BankAccount;

public class BankDemo {
    public static void main(String[] args) {

        Account bobsAccount = new Account();//("12345", 0.00, "Bob Brown", "myemail@email.com","456789456"); // calling constructor

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.setBalance(0.00);

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.1);
        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com","123456");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

    }
}
