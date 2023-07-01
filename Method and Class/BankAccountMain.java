public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        account.displayAccountInfo();

        account.deposit(500.0);
        account.withdraw(200.0);

        account.displayAccountInfo();
    }
}
