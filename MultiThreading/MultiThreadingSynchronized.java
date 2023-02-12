/* To make a method or a class thread safe we must use the keyword synchronized. The function of this keyword is that
only one thread can use that method or class at a time, this can help fixing undesired output. Because sometime when a
method or class are not synchronized multiple thread access the data in the same time and work with invalid data.
To avoid such a misunderstanding we must use synchronized keyword to make a method or class thread safe
 */

package MultiThreading;

public class MultiThreadingSynchronized {

    //n = 100;

    static int n;
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    increment();
                }
            }
        },"Thread 1-1000");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i = 1; i <= 1000; i++){
                    increment();
                }
            }
        },"Thread 1000-2000");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(n);



    }
    public synchronized static void increment(){
        n++;
    }
}
