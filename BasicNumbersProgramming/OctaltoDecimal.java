package BasicNumbersProgramming;
public class OctaltoDecimal {
    public static void main(String[] args) {
        int n = 13;
        int sum = 0;
        int k = 0;
        while(n!=0){
            int d = n % 10;
            sum = sum + d * power(8, k++);
            n = n /10;
        }
        System.out.println(sum);
    }

public static int power(int n, int p) {
    int res = 1;
    for(int i = 1; i <= p; i++){
    res = res * n;
    }
    return res;
}

}
