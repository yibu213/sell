package test.test;

public class LoginServl {
    private static String serUsername;
    private static String serPassword;
    synchronized  public static void doPost(String username,String password){
        serUsername=username;
        if(username.startsWith("a")){
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        serPassword =password;
        System.out.println("username:"+serUsername+" password:"+serPassword);
    }
}
