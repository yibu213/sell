package test.thread;

import test.test.MyObject;

public class Thread7 extends  Thread {
    private MyObject myObject;
    public Thread7(MyObject object){
        myObject=object;
    }
    @Override
    public void run() {
        myObject.methodA();
    }
}
