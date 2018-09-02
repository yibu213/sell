package test.test;

import test.thread.MyThread;
import test.thread.Thread4;

public class Test3 {
    public static  void main(String[] args){
        MyThread thread4 =new MyThread();
        System.out.println(thread4.isAlive());
        thread4.start();
        System.out.println(thread4.getId()+":"+thread4.isAlive());
        System.out.println(Thread.currentThread().getId()+":"+thread4.isAlive());
    }
}
