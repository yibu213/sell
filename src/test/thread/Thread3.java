package test.thread;

import test.test.LoginServl;

public class Thread3 extends  Thread {
    private String username="aa";
    private String password="aa1";
    private LoginServl loginServl=new LoginServl();
    @Override
    public void run(){
        LoginServl.doPost("a","aa");
    }
}
