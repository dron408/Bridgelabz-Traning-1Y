package mulithreding;

public class runner {
    public static void main(String args[]){
        mythread1 t1 = new mythread1();
        Thread thread = new Thread();
        thread.start();
        mythread2 t2 = new mythread2();
        t2.run();
    }
}
