package test.thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10L);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程正在运行");
    }
}
