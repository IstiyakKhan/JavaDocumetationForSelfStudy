/* By default, in java a name is given to a thread, but we can also explicitly set a name to a particular thread
We can also specify the priority given to a thread with a number, which ranges from 1 to 10, 1 being the least priority and
10 being the highest priority. We can also use some constants like Thread.MIN_PRIORITY.

Name : To find of get the name of a thread we can use the getName() and to set the name we can do either by setName() or
via constructor
 */



package MultiThreading;

public class NameAndPriorityThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           for(int i = 1; i <= 10; i++){
               System.out.println("Thread 1");
               try{Thread.sleep(500);}catch (Exception e){};
           }
        },"Thread No 1");

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("Thread 2");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        },"Thread No 2");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setName("New Thread No 1");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(10);



    }
}
