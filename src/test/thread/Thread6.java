package test.thread;

public class Thread6 extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("begin");
            System.out.println("---:"+Thread.interrupted());
            Thread.sleep(50000l);
            System.out.println("end");

        } catch (InterruptedException e) {
            System.out.println("先沉睡再终结:"+Thread.interrupted());
            e.printStackTrace();
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    if (Thread.interrupted()) {
                        System.out.println("该线程已被中断");
                        throw new Exception("线程中断");
                    }
                    System.out.println(i);
                }
                System.out.println("for外面的语句");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
