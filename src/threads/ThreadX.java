package threads;

public class ThreadX extends Thread {
	 static int sum = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName());

			}
			System.out.println("sum of thread = " + sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
//		ThreadX threads[][] = new ThreadX[n][n];
		ThreadX threads[][] = new ThreadX[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				threads[i][j] = new ThreadX();
				threads[i][j].setName("thread" + i + "," + j);
				if (threads[i][j] != null) {
					sum += 1;
				} else {
					sum += 0;
				}

//			threads[i].start();
			}
//			sum += 1;

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				threads[i][j].start();
				try {
					threads[i][j].join();
//					sum += 1;

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName());

			}
		}

	}

}
