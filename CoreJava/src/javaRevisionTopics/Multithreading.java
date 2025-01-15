/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 15 Jan 2025 @ 5:22:39 am
 */

package javaRevisionTopics;

public class Multithreading {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		Counter c = new Counter();
		System.out.println(c.getCount());
	}

}

//using Thread Class
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running.");
	}
}

//using runnable interface
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Runnable thread is runnning.");
	}
}

//synchronization
class Counter {
	private int count = 0;
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}




