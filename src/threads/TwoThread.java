package threads;

public class TwoThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("New thread");
//			Thread.yield();
			Wait(300);
		}
	}
	  static void Wait(long milli) {
	        System.out.println("pause de "+milli+" ms") ;
	        try {
	            Thread.sleep(milli);
	        } catch (InterruptedException x) {
	            // ignorer
	        }
	    }


	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
		tt.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
			System.out.println(Thread.currentThread().getName());
			Wait(200);
		}
	}
}
