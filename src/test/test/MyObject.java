package test.test;

public class MyObject {
    public synchronized void   methodA(){
        System.out.println("MethodA begin");
        long start=System.currentTimeMillis();
        System.out.println("methodA:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end =System.currentTimeMillis();
        System.out.println("MethodA end,运行时间为:"+(end-start));
    }
    public synchronized  void methodB(){
        System.out.println("MethodB begin");
        long start=System.currentTimeMillis();
        System.out.println("methodB:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end =System.currentTimeMillis();
        System.out.println("MethodB end,运行时间为:"+(end-start));
    }
}
