package abstraction;

public class Main {
    public static void main(String[] args) {
        SavingsAccount  savingAccount   = new SavingsAccount("savings-123", 1000, 1.05);
        CheckingAccount checkingAccount = new CheckingAccount("12314",2000,400);

        savingAccount.deposit(600);
        checkingAccount.withdraw(200);

        savingAccount.withdraw(800);
        checkingAccount.deposit(100);

        savingAccount.displaybalance();
        checkingAccount.displaybalance();


}
}