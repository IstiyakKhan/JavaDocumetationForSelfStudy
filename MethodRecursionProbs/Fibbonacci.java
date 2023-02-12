package MethodRecursionProbs;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibb(0,1,10);
    }
    public static void fibb(int a, int b, int n){
        int sum = 0;
        if(n != 0){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            fibb(a,b,n-1);
        }
    }
}
