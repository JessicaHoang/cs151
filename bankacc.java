
public class bankacc {
	private double balance;
	
	/*Constructor*/
	public bankacc() {
		balance = 0;
	}
	
	public void deposit(double d) {
		System.out.println("Depositing: "+ d);
		double currentBalance = balance + d;
		System.out.println("Your current balance is: "+currentBalance);
		balance = currentBalance;
	}
	
	public void withdrawal(double w) {
		System.out.println("Withdrawing: "+ w);
		double currentBalance = balance - w;
		System.out.println("Your current balance is: "+currentBalance);
		balance = currentBalance;
	}

	public double getBalance() {
		return balance;
	}
}

