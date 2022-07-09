public class Multithreading2 implements Runnable {
	private final int thread;

	public Multithreading2(int thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		for(int i = 3; i <= 5; i++) {
			System.out.println(i + " from thread #" + thread);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
