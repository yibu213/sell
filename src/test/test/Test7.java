package test.test;

import test.thread.Thread7;
import test.thread.Thread8;

public class Test7 {
    public static void  main(String[] args){
        MyObject myObject = new MyObject();
        Thread7 thread7 = new Thread7(myObject);
        Thread8 thread8 = new Thread8(myObject);
        thread7.start();
        thread8.start();
    }
}
