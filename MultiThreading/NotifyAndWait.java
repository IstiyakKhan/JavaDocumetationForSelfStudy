package MultiThreading;

class PE extends Thread{

    int total;

    @Override
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }
}
public class NotifyAndWait {
    public static void main(String[] args) {
        PE p = new PE();
        p.start();

        synchronized (p) {
            try {
                p.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(p.total);
        }
    }
}
