package MultiThreading;

public class JoinAndisAlive {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Hi");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i = 1; i <= 5; i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        });

        t1.start();
        try{Thread.sleep(50);}catch (Exception e){};
        t2.start();

        System.out.println(t1.isAlive());
        t1.join(); //This join() is used to stop the execution of main method until the execution of this thread is method is completed
        t2.join();

        System.out.println("Check"); //To create the current lifecycle of a thread
        System.out.println(t1.isAlive());

    }

}
