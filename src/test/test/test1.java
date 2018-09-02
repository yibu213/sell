package test.test;

import test.runnable.MyRunnable;

public class test1 {
    public static void main(String[] args){
        System.out.println(1);
        Runnable run  = new MyRunnable();
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(th1);

        th1.start();
        System.out.println("线程运行结束");
    }
}
