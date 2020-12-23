public class Synchronized {

	public static void main(String[] args) {
		Table2 table = new Table2();
		MyThread3 thread1 = new MyThread3(table);
		MyThread4 thread2 = new MyThread4(table);
		thread1.start();
		thread2.start();
	}
}

class Table2 {
	synchronized void printTable(int n) {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(n + " x " + i + " = " + n * i);
			}

		} catch (Exception e) {
			System.out.println("Exception found");
		}
	}
}

class MyThread3 extends Thread {
	Table2 t;

	MyThread3(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread4 extends Thread {
	Table2 t;

	MyThread4(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}