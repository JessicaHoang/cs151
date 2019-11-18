
public class hw4 {
	public static void main(String[] args) {
		bankacc a = new bankacc();
		final double amount = 100;
		final int repetitions = 100;
		final int threads = 100;
		
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
