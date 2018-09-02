package test.thread;

import test.test.ObjectService;

public class Thread11 extends  Thread {
    private ObjectService objectService;
    public Thread11(ObjectService objectService){
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMehtod("thread11");
    }
}
