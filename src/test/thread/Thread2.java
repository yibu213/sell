package test.thread;

public class Thread2 extends Thread {
    public   int count=100;
    public Thread2(String name){
      super();
      Thread.currentThread().setName(name);
    }

    @Override
    public  synchronized void run(){

        for (int i =0 ;i<100;i++){
            if(count<0){return;};

            System.out.println(count--);
    }
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}}
