public class ThreadJava2 implements Runnable {
	public static void main(String[] args) {
		ThreadJava2 obj = new ThreadJava2();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}
