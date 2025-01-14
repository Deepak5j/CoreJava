/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 15 Jan 2025 @ 5:22:39 am
 */

package javaRevisionTopics;

public class Multithreading {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}

}

//using Thread Class
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running.");
	}
}


