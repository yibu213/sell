package test.test;

public class ObjectService
{
    public void serviceMehtod(String name){
        synchronized (this){
            System.out.println(name+"-begin:"+System.currentTimeMillis());
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+"-end:"+System.currentTimeMillis());
        }
    }
}
