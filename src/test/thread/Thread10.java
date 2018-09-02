package test.thread;

import test.test.ObjectService;

public class Thread10 extends Thread {
    private ObjectService objectService;
    public Thread10(ObjectService objectService){
        super();
        this.objectService=objectService;
    }
    @Override
    public void run() {
        super.run();
        objectService.serviceMehtod("thread10");
    }
}
