package MethodRecursionProbs;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(14));
    }
    public static int sum(int n){
        if(n != 0){
            return n % 10 + sum(n / 10);
        }
        else {
            return 0;
        }
    }
}
