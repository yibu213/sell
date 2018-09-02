package test.test;

import test.thread.Thread3;
import test.thread.Thread4;

public class LoginTest {
    public static void  main(String[] args){
        Thread4 thread4 = new Thread4();
        Thread3 thread3 = new Thread3();
        thread3.start();
        thread4.start();
    }
}
