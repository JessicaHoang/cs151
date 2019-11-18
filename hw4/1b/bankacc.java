import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankacc {
	private double balance;
	private Lock lockBalance;
	private Condition correctBalanceCond;
	
	/*To overcome this problem, we will use locks and conditions.
	 * Conditions will allow a thread to release an object and
	 * regain the lock again.*/
	
	/*Constructor*/
	public bankacc() {
		balance = 0;
		lockBalance = new ReentrantLock();
		correctBalanceCond = lockBalance.newCondition();
	}
	
	public void deposit(double d) {
		lockBalance.lock();
		
		/*Locks will prevent deposits from happening
		 * concurrently with another transaction
		 * on the same bank account.*/
		
		try {
			System.out.println("Depositing: "+ d);
			double currentBalance = balance + d;
			System.out.println("Your current balance is: "+currentBalance);
			balance = currentBalance;
			correctBalanceCond.signalAll();
		}
		finally {
			lockBalance.unlock();
		}

	}
	
	public void withdrawal(double w) throws InterruptedException{
		
		lockBalance.lock();
		
		/*Locks are necessary to prevent withdraws from
		 * happening concurrently as well as from happening 
		 * when the balance is at 0. This is to prevent a 
		 * negative balance*/
		
		try {
			while(balance < w) {
				correctBalanceCond.await();
			}
			
			System.out.println("Withdrawing: "+ w);
			double currentBalance = balance - w;
			System.out.println("Your current balance is: "+currentBalance);
			balance = currentBalance;
		}
		finally {
			lockBalance.unlock();
		}
	}

	public double getBalance() {
		return balance;
	}
}

