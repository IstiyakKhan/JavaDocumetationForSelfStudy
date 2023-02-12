package MethodRecursionProbs;

public class Loop {
    public static void main(String[] args) {
        loop(10);
    }

    public static void loop(int n){
        int l = n;
        if(n != 0){
            loop(n-1);
            System.out.println(l);
        }
    }
}
