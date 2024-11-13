public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount Account_1 = new BankAccount();
        Account_1.deposit(50000);
        Account_1.withdraw(5000);
        Account_1.getBalance();
    }
}
