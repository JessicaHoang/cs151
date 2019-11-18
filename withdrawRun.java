

public class withdrawRun implements Runnable{
	
	private final static int delay = 1;
	private bankacc acc;
	private double amount;
	private int c;
	
	/*construct*/
	public withdrawRun(bankacc anAcc, double anAmount, int aCounter) {
		acc = anAcc;
		amount = anAmount;
		c = aCounter;
	}
	
	public void run() {
		try {
			for(int i=1; i<c; i++) {
				acc.withdrawal(amount);
				Thread.sleep(delay);
			}
		}catch(InterruptedException exception) {}
	}
	
}