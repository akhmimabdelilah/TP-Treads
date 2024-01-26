package threads;

class Test {
	public static void main(String args[]) {
		final Customer c = new Customer();

		Thread t1 = new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				c.withdraw(3000);
			}
		};
		t3.start();
		
		Thread t4 = new Thread() {
			public void run() {
				c.withdraw(500);
			}
		};
		t4.start();

	}
}
