package SBI;

public class Message {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vbal l =Vbal.getInstance();
		l.log("your balance id *****");
		Withdraw m =Withdraw.getInstance();
		m.log("withdraw amount is ****");
		Deposit n =Deposit.getInstance();
		n.log("Deposited amount is ****");
	}

}
