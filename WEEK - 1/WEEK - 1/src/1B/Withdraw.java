package SBI;


public class Withdraw {
	private static Withdraw s_instance = null;
	 private Withdraw() {}
		 public static Withdraw getInstance() {
			 if(s_instance==null) {
				 s_instance = new Withdraw();
			 }return s_instance;
		 }
	 public void log(String message) {
		 System.out.println("Wihtdraw:"+message);
		 }
}
