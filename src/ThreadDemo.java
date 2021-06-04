class ThreadClass extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(i + " Typing");
		}
	}
}

class ThreadClass2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " Cooking");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		ThreadClass2 t2 = new ThreadClass2();//Runnable Interface
		// Concurrent Tasks
		// Decision for completing a task is decided runtime		
		t1.start();
		Thread t3 = new Thread(t2);
		t3.start();
	}

}
