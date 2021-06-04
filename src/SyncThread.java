
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class Table {
	// Controlling Thread's Resources
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Group1 extends Thread {
	Table t;

	public Group1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Group2 extends Thread {
	Table t;

	public Group2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class SyncThread {
	public static void main(String[] args) {
		Table obj = new Table();
		Group1 g1 = new Group1(obj);
		Group2 g2 = new Group2(obj);
		g1.start();
		g2.start();

	}
}
