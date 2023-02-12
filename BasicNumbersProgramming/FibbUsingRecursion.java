package BasicNumbersProgramming;

public class FibbUsingRecursion {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        fib(a,b,8);
        System.out.println(b);
        System.out.println(a);
    }
    public static void fib(int a, int b, int c){
        int sum = 0;
        if(c == 0){
            System.out.println(a);
            System.out.println(b);
        }
        else {
            sum = a + b;
            a = b;
            b = sum;
            fib(a,b,c-1);
            System.out.println(sum);
        }
    }
}
