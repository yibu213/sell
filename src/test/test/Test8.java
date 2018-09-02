package test.test;

import test.thread.Thread9;

public class Test8 {
    public static  void main(String[] args){
        Service1 service1 = new Service1();
        Thread9 thread9 = new Thread9(service1);
        Thread9 thread10 = new Thread9(service1);
        thread10.start();
        thread9.start();
    }
}
