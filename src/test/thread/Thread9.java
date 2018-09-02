package test.thread;

import test.test.Service1;

public class Thread9 extends Thread{
    private Service1 service1;
    public Thread9(Service1 service1){
        super();
        this.service1=service1;
    }
    @Override
    public void run() {
        super.run();
        service1.service1();
    }
}
