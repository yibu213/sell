package test.test;

import test.thread.Thread2;

public class test2 {
    public static void main(String[] args){
        Thread2 thre1 = new Thread2("count");

        Thread thread2 = new Thread(thre1);
        Thread thre3 = new Thread(thre1);
        Thread thre4 = new Thread(thre1);
        Thread thre5 = new Thread(thre1);
        Thread thre6 = new Thread(thre1);
        thre1.start();
        thread2.start();
        thre3.start();
        thre4.start();
        thre5.start();
        thre6.start();
    }
}
