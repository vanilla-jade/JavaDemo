package CodeTest.ThreadTest.ThreadMgr;

class MyThread1 extends Thread{
	@Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("MyThread1_" + i);
            try {
                sleep(10);    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}

class MyThread2 extends Thread{
	@Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("MyThread2_" + i);
            try {
                sleep(10);    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}

class MyThread3 extends Thread{
	@Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("MyThread3_" + i);
            try {
                sleep(10);    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}

class MyThread4 extends Thread{
	@Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("MyThread4_" + i);
            try {
                sleep(10);    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}