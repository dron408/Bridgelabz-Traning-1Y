package mulithreding;

public class mythreadsir implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("mahesh");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
