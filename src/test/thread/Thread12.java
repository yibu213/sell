package test.thread;

import java.security.ProtectionDomain;
import java.util.concurrent.*;

public class Thread12 implements  Runnable{
    private  int id;
    private CountDownLatch c;
    public Thread12(int id) {
                this.id = id;
                this.c=c;
           }

    @Override
     public void run() {
                // TODO Auto-generated method stub
                System.out.println("#" + id + "   threadId=" + Thread.currentThread().getName() );
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
                    }finally {
            c.countDown();
        }

           }


    public static void main(String[] args){
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        CountDownLatch c=         new CountDownLatch(7);

        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                3, 5, 60, TimeUnit.MICROSECONDS,queue);
        for (int i=0; i<7; i++){
                        Runnable task = new Thread12(i);
            poolExecutor.execute(task);
                       }
       /* try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.print("主线程结束");
        poolExecutor.shutdown();
    }
}
