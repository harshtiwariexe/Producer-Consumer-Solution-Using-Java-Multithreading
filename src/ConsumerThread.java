public class ConsumerThread extends Thread {
    Company c;
    ConsumerThread(Company c){
        this.c=c;
    }


    public void run() {
        int i = 1;
       while (i<100){
           this.c.Consumer();

           try{
               Thread.sleep(500);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           i++;

       }
    }
}
