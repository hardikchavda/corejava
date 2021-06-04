class ThreadExe extends Thread {
	public void run() {
		System.out.println("Running");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		// Cannot share same resource
		ThreadExe t1 = new ThreadExe();
		ThreadExe t2 = new ThreadExe();
		ThreadExe t3 = new ThreadExe();
		
		t1.setName("Cooking");
		t2.setName("Learning");
		t3.setName("Cleaning");
		
		t1.setPriority(Thread.MIN_PRIORITY); //01
		t3.setPriority(Thread.NORM_PRIORITY);//05
		t2.setPriority(Thread.MAX_PRIORITY); //10
		 
		
		t1.start();		
		System.out.println(t1.getId() + ":" + t1.getName());
		t2.start();
		System.out.println(t2.getId() + ":" + t2.getName());
		t3.start();
		System.out.println(t3.getId() + ":" + t3.getName());

		 
		
		
	}

}
