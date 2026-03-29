package mulithreding;

public class runner2 {
    public static void main(String args[]){
    mythreadnew t1 = new mythreadnew();
    Thread thread1 = new Thread(t1);
    t1.start();

    }
}
