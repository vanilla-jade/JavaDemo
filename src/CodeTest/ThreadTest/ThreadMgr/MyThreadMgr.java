package CodeTest.ThreadTest.ThreadMgr;

public class MyThreadMgr{
      public void run(){
        MyThread1 a = new MyThread1();
        MyThread2 b = new MyThread2();
        MyThread3 c = new MyThread3();
        MyThread4 d = new MyThread4();
        a.start();
        b.start();
        c.start();
        d.start();
      }
}