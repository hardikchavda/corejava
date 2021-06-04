class ThreadJoin extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + ":" + Thread.currentThread().getName());
		}
	}
}

public class ThreadJoining {

	public static void main(String[] args) {

		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();

		t1.setName("Cooking");
		t2.setName("Learning");
		t3.setName("Cleaning");
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t3.start();

	}

}
