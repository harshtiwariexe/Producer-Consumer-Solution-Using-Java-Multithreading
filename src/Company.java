public class Company {

    private int n;

    boolean key = false;
    synchronized public void Producer(int n){
        if(key){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;



        System.out.println("Produces " + this.n);
        key=true;
        notify();
    }
    synchronized public int Consumer(){
        if(!key){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed " + this.n);
        key = false;
        notify();
        return this.n;
    }
}
