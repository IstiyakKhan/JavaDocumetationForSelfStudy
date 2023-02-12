/*Multi-Threading = It is the process of performing multiple sub-processes of a process at the same time to take
complete benefits of modern day multicore CPUs.Java supports multi-threading.
Why to use Multi-Threading ?
1) Better performance - i.e = If there are 2 tasks in the main thread and each takes 10 seconds of time to complete,
without multithreading the main thread in java will execute the first take and while it executes it uses a single core
and the second task will be left idle for 10 seconds or until java completes first tasks, modern cpu have multi-cores
which can handle multiple tasks in the same time. So in this case multi-threading can be more powerful and efficient
2) Game Development = In games there are many subprocesses that happen on the same time, like texture loading , enemy
loading etc. Multi-threading in this case is very useful.
3) Webpages = Multiple users can perform task on a website at the same time, multi-threading is also very useful here.

There are 2 ways to create a thread in java 1) extending Thread class 2) implementing Runnable Interface. These both
class have a run method which we need to override and put some logic or task that this particular task will perform.

To start a thread we need to use start().It is only present in the thread class.

sleep method = It is used to stop or pause the execution of a thread for a particular time, the sleep() takes some
numbers as argument which are considered milliseconds.
 */


package MultiThreading;

class Hi extends Thread{ // Creating a thread using Thread Class

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch (InterruptedException e) {} //Sleep method
        }
    }
}

class Hello extends Thread{ // Creating a thread using Thread class

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch (InterruptedException e) {} //sleep method
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) { //This is the main thread

        Hi ref = new Hi();
        Hello ref1 = new Hello();
        ref.start();
        try {Thread.sleep(50);} catch (InterruptedException e) {} //This is used to schedule the thread
        ref1.start();
    }

}

/* So with this example we are perform 2 tasks, 1) print 'hi' 2) print 'hello', at the same time with the help of
multi-threading in java.
 */
