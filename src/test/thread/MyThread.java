package test.thread;

public class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println("线程是否在运行:"+Thread.currentThread().isAlive());
    }
}
