package SBI;

public class Vbal {
	private static Vbal i_instance = null;
	 private Vbal() {}
		 public static Vbal getInstance() {
			 if(i_instance==null) {
				 i_instance = new Vbal();
			 }return i_instance;
		 }
	 public void log(String message) {
		 System.out.println("Balance:"+message);
		 }
	}
	
