package SBI;

public class Deposit {
	private static Deposit ii_instance = null;
	 private Deposit() {}
		 public static Deposit getInstance() {
			 if(ii_instance==null) {
				 ii_instance =new Deposit();
			 }return ii_instance;
		 }
	 public void log(String message) {
		 System.out.println("Withdraw:"+message);
		 }
}
