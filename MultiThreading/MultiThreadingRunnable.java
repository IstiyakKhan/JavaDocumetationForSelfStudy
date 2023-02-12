/*Multi-Threading with Runnable : There are two ways to create and execute a thread in java. Runnable interface doesn't
have a start() to start the execution of a thread. To do that we need to create an object of thread class and pass the
object of runnable interface as obj in constructor argument.
 */

package MultiThreading;

class Hi2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch (InterruptedException e) {}
        }
    }
}

class Hello2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {

        Runnable ref = new Hi2();
        Runnable ref1 = new Hello2();

        Thread t1 = new Thread(ref);
        Thread t2 = new Thread(ref1);

        t1.start();
        try{Thread.sleep(50);}catch (Exception e){}
        t2.start();
    }
}
