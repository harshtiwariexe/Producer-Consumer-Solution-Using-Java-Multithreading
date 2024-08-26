public class ProducerThread extends Thread {
    Company c;

    ProducerThread(Company c){
        this.c  = c;
    }

    public void run(){
        int i = 1;
        while(i<100){
            this.c.Producer(i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
