package test.test;

import test.thread.Thread6;

public class Test5 {
    public static void main(String[] args){
        Thread6.Thread5 thread5 = new Thread6.Thread5();
        thread5.start();

        thread5.interrupt();
    }
}
