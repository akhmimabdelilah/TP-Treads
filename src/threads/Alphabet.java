package threads;

public class Alphabet implements Runnable {
	public void affiche() {
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);
			try {
				Thread.sleep(10); // ms
			} catch (InterruptedException e) {
			}	
		}
		System.out.print("\n");
	}
	
	@Override
	public void run() {		
	}

	public static void main(String args[]) {
		Alphabet A = new Alphabet();
		A.affiche();

		Alphabet A1 = new Alphabet();
		Thread T1 = new Thread(A1);
		Alphabet A2 = new Alphabet();
		Thread T2 = new Thread(A2);
		T1.start();
		T2.start();

	}
}
