package CodeTest.BarrierTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierTest {
	public static void main(String[] args) {
		int N = 4;
		CyclicBarrier barrier = new CyclicBarrier(N);
		for (int i = 0; i < N; i++) {
			new MyThread(barrier, (i + 1) * 1000).start();
		}
	}
}

class MyThread extends Thread {
	private static final String STRINGEND = "结束";
	private static final String STRINGSTART = "开始";
	private static final String STRINGWAIT = "延迟";
	private CyclicBarrier cyclicBarrier;
	private long waittime;
	
	public MyThread(CyclicBarrier cyclicBarrier, long waittime) {
		this.cyclicBarrier = cyclicBarrier;
		this.waittime = waittime;
	}	
	
	@Override
	public void run() {
		try {
			System.out.println(STRINGWAIT + waittime + STRINGSTART);
			Thread.sleep(waittime);
			System.out.println(STRINGWAIT + waittime + STRINGEND);
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		} 
		System.out.println("所有线程写入完毕！");
	}
}
