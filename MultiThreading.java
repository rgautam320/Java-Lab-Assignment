import java.util.Scanner;

public class MultiThreading {

	public static void main(String[] args) {
		System.out.println("<--Choose the way-->");
		System.out.println("1. Thread Creation by extending the Thread Class");
		System.out.println("2. Thread Creation by implementing the Runnable Interface");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1: {
			int n = 8;
			for (int i = 0; i < n; i++) {
				ByThreadExtend byThreadExtend = new ByThreadExtend();
				byThreadExtend.start();
			}
		}
			break;
		case 2: {
			int n = 8;
			for (int i = 0; i < n; i++) {
				Thread objectThread = new Thread(new ByThreadImplement());
				objectThread.start();
			}
		}
			break;
		default:
			System.out.println("Unexpected value: " + choice);
		}

	}
}

class ByThreadExtend extends Thread {
	public void run() {
		try {
			// Printing Thread Details
			System.out.println("Thread " + Thread.currentThread().getId() + " (" + Thread.currentThread().getName()
					+ ") is running");
		} catch (Exception e) {
			// Throwing exception
			System.out.println("Some exception found.");
		}
	}
}

class ByThreadImplement implements Runnable {
	public void run() {
		try {
			System.out.println(
					"Thread " + Thread.currentThread().getId() + " (" + Thread.currentThread().getName() + ")");
		} catch (Exception e) {
			System.out.println("Exception is found");
		}
	}
}