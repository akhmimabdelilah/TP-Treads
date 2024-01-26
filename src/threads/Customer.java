package threads;

public class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		while (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
		System.out.println(Thread.currentThread().getName()+ " "+ this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}
