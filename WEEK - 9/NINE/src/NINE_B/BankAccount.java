package NINE_B;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
    this.balance = initialBalance;
    }
    public synchronized void deposit(double amount) {
    if (amount > 0) {
    balance += amount;
    System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    }
    public synchronized void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
    balance -= amount;
    System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    } else {
    System.out.println("Withdrawal of " + amount + " failed, insufficient funds.");
    }
    }
    public synchronized double getBalance() {
    return balance;
    }
   }
 