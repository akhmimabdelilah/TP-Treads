package threads;


import java.util.Random;

public class ThreadTab extends Thread {
	static int tab[][] = null;
	static int som[] = null;
	int index = -1;

	public void run() {
		for (int i = 0; i < tab[index].length; i++) {
			som[index] += tab[index][i];
		}
		System.out.println(getName() + " : " + som[index]);
	}

	public static void affiche(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		tab = new int[n][n];
		som = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tab[i][j] = random.nextInt(10);
			}
		}

		affiche(tab);

		ThreadTab threads[] = new ThreadTab[n];
		for (int i = 0; i < n; i++) {
			threads[i] = new ThreadTab();
			threads[i].index = i;
			threads[i].start();
			try {
				threads[i].join();
//				sum += 1;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		int s = 0;
		for (int i = 0; i < som.length; i++) {
			s+= som[i];
			System.out.println("sum = "+ s); 
			
		}

	}

}