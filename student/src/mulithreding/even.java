package mulithreding;

public class even implements Runnable{
    @Override
    public void run(){
        for(int i=10;i>0;i--){
            if(i%2==0){
                System.out.println(i);
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
