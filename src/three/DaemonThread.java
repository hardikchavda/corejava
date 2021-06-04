package three;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class DaemonTest extends Thread {
	// Low Priority Thread
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Is Daemon");
		} else {
			System.out.println("Other Threads");
		}

	}
}

public class DaemonThread {

	public static void main(String[] args) {
		DaemonTest t1 = new DaemonTest();
		DaemonTest t2 = new DaemonTest();
		DaemonTest t3 = new DaemonTest();

		t1.setDaemon(true);

		t2.start();
		t3.start();
		t1.start();// It will get completed by JVM

	}
}
