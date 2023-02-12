package MethodRecursionProbs;

public class Power {
    public static void main(String[] args) {
        System.out.println(Power(2,3));
    }
    public static int Power(int n, int p){
        if(p == 0){
            return 1;
        } else if (n < 0 || p < 0) {
            System.out.println("No Negative Integers");
            return -1;

        } else {
            return n * Power(n,p-1);
        }
    }
}
