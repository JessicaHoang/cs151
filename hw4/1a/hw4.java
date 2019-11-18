
public class hw4 {
	public static void main(String[] args) {
		bankacc a = new bankacc();
		final double amount = 75;
		final int repetitions = 75;
		final int threads = 75;
		
		for(int i = 1; i <= threads; i++) {
			depositRun d = new depositRun(a, amount, repetitions);
			withdrawRun w = new withdrawRun(a, amount, repetitions);
			
			Thread dThread = new Thread(d);
			Thread wThread = new Thread(w);
			
			dThread.start();
			wThread.start();
		}
	}
}
