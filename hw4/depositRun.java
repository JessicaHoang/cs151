
public class depositRun implements Runnable{
	
	private final static int delay = 1;
	private bankacc acc;
	private double amount;
	private int c;
	
	/*constructor*/
	public depositRun(bankacc anAcc, double anAmount, int aCounter) {
		acc = anAcc;
		amount = anAmount;
		c = aCounter;
	}
	
	public void run() {
		try {
			for(int i=1; i<c; i++) {
				acc.deposit(amount);
				Thread.sleep(delay);
			}
		}catch(InterruptedException exception) {}
	}
}