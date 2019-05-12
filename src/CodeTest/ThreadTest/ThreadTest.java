package CodeTest.ThreadTest;

import CodeTest.ThreadTest.ThreadMgr.*;

public class ThreadTest {
	public static void main(String[] args) {
		MyThreadMgr a = new MyThreadMgr();
		a.run();
		MyThread5 b = new MyThread5();
		b.start();
	}
}

class MyThread5 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread5_" + i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}