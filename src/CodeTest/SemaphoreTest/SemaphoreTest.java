package CodeTest.SemaphoreTest;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        int N = 8;
        Semaphore semaphore = new Semaphore(4);
        for (int i = 0; i < N; i++) {
            new Worker(i, semaphore).start();
        }
    }
}

class Worker extends Thread {
    private int num;
    private Semaphore semaphore;

    static {
        System.out.println("Worker���һ�μ��أ�ֻ��ִ��һ��");
    }

    public Worker(int num, Semaphore semaphore) {
        this.num = num;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(num + "ռ�û���");
            Thread.sleep((num + 1) *  1000);
            System.out.println(num + "�ͷŻ���-------");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}