class SleepThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000); // In Milliseconds
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+ " Task 1");
		}
	}
}
class SleepThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500); // In Milliseconds
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + " Task 2");
		}
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		SleepThread t1 = new SleepThread();
		SleepThread2 t2 = new SleepThread2();
		t1.start();
		t2.start();
		

	}

}
