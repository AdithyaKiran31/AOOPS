package SBI;

public class Final {
	public static void main(String[] args) {
		Vbal l =Vbal.getInstance();
		l.log("  your balance is  ****   ***");
		Deposit m =Deposit.getInstance();
		m.log("  deposit amount id *******");
		Withdraw n =Withdraw.getInstance();
		n.log("  Withdraw amount is ***** ");
	}
}
