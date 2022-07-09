public class Multithreading1 extends Thread {
	private final int thread;

	public Multithreading1(int thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		for(int i = 0; i <= 2; i++) {
			// System.out.println(i);
			System.out.println(i + " from thread #" + thread);

			// threads aren't affected by an exception thrown in 1 of them
			if(thread == -1) {
				throw new RuntimeException();
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
