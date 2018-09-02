package test.test;

import test.thread.Thread10;
import test.thread.Thread11;
import test.thread.Thread9;

public class Test9 {
    public static void main(String[] args){
        ObjectService objectService = new ObjectService();
        Thread10 thread10 = new Thread10(objectService);
        Thread11 thread11 = new Thread11(objectService);
        thread10.start();
        thread11.start();
    }
}
