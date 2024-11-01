package NINE_B;

public class BankAccountSystem {
    public static void main(String[] args) {
    BankAccount account = new BankAccount(500);
    Thread user1 = new Thread(new BankTransaction(account));
    Thread user2 = new Thread(new BankTransaction(account));
    Thread user3 = new Thread(new BankTransaction(account));
    user1.start();
    user2.start();
    user3.start();
    try {
    user1.join();
    user2.join();
    user3.join();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    System.out.println("Final Balance: " + account.getBalance());
    }
   }
