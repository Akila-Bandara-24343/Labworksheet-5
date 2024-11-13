public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }
    public void getBalance(){
        System.out.println("Your current account balance is :\t"+balance);
    }

    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        if((balance-amount)<0){
            System.out.println("Account balance is insufficient.Withdrawal can't perform at the moment");
        }else {
            balance=balance-amount;
        }
    }






}
