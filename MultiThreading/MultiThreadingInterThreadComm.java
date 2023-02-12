package MultiThreading;


class Num{
    int num;
    boolean valueSet = false;

    public synchronized void getNum() {
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get : " + num);
        valueSet = false;
        notify();
    }

    public synchronized void setNum(int num) {
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.num = num;
        System.out.println("Set : " + num);
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable{

    Num num;

    public Producer(Num num){
        this.num = num;
        Thread t1 = new Thread(this);
        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        synchronized (this){
        int i = 0;
        while (true){
            num.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
}

class Consumer implements Runnable{

    Num num;

    @Override
    public void run() {
        while (true){
            num.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public Consumer(Num num){
        this.num = num;
        Thread t2 = new Thread(this);
        t2.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MultiThreadingInterThreadComm {
    public static void main(String[] args) {
        Num num = new Num();
        new Producer(num);
        new Consumer(num);
    }
}
