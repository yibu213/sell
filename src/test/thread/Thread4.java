package test.thread;

import test.test.LoginServl;

public class Thread4 extends  Thread {
    private String username="bb";
    private String password="bb1";

    @Override
    public void run(){
        LoginServl.doPost("b","bb");
        System.out.println(Thread.interrupted()+"--------------------------------------");
    }
}
