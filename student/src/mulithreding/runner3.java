package mulithreding;

public class runner3 {
    public static void main(String args[]){
        odd t1 = new odd();
        even t2 = new even();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);



        thread1.start();
        thread2.start();

    }

}
