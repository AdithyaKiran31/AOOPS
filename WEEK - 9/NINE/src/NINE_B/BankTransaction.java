package NINE_B;

class BankTransaction implements Runnable {
    private final BankAccount account;
    public BankTransaction(BankAccount account) {
    this.account = account;
    }
    @Override
    public void run() {
    account.deposit(100);
    account.withdraw(50);
    account.withdraw(200);
    System.out.println("Current Balance: " + account.getBalance());
    }
}