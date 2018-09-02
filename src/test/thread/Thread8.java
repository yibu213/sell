package test.thread;

import test.test.MyObject;

public class Thread8 extends  Thread {
    private  MyObject object;
    public Thread8(MyObject object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
