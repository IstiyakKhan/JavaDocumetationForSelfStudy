/* Creating threading using lambdas expressions : By using this we can reduce number of lines of code and make it look
more efficient. With the help of anonymous class and lambda expressions
 */

package MultiThreading;

public class MultiThreadingLambdaExpressions {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Hi");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        });

        t1.start();
        try{Thread.sleep(50);}catch (Exception e){};
        t2.start();

    }
}

/* With this we don't need to create extra classes for each task or thread and extend or implement them with Thread
or Runnable. This way is preferred as it looks more efficient and doesn't create multiple classes or consume lines of
code for creating a thread
 */
