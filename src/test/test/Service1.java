package test.test;

import test.thread.Thread9;

public class Service1 {
    public  void service1() {
        System.out.println("service1");
        service2();
    }
    public synchronized void service2() {
        System.out.println("service2");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service3();
    }
    public  void service3() {
        System.out.println("service3");
    }
}
