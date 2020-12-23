public class NonSynchronized {

	public static void main(String[] args) {
		Table1 table = new Table1();
		MyThread1 thread1 = new MyThread1(table);
		MyThread2 thread2 = new MyThread2(table);
		thread1.start();
		thread2.start();
	}
}

class Table1 {
	void printTable(int n) {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(n + " x " + i + " = " + n * i);
			}

		} catch (Exception e) {
			System.out.println("Exception found");
		}
	}
}

class MyThread1 extends Thread {
	Table1 t;

	MyThread1(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table1 t;

	MyThread2(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}