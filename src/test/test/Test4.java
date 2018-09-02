package test.test;

import test.thread.Thread4;

public class Test4 {
    public static void main(String[] args){
        Thread.currentThread().interrupt();
        Thread4 thread4 = new Thread4();
        thread4.start();
        System.out.println("main线程是否中断:"+Thread.currentThread().isInterrupted());
        System.out.println("main线程是否中断:"+Thread.interrupted());
        System.out.println("main线程是否中断:"+Thread.interrupted());
        System.out.println("main线程是否中断:"+Thread.currentThread().isInterrupted());

    }
}
