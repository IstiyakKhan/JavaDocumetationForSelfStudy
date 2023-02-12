//Binary --> Decimal --> Octal
package BasicNumbersProgramming;
public class BinarytoOctal {
    public static void main(String[] args) {
        int n = 1101110010;
        int sum = 0;
        String octal = "";
        int k = 0;
        while(n!=0){
            int d = n % 10;
            sum = sum + d * power(2, k++);
            n = n /10;
        }
        while(sum != 0){//Code for Decimal to Octal Conversion
            int o = sum % 8;
            octal = o + octal;
            sum = sum / 8;
        }
        System.out.println(octal);
    }

public static int power(int n, int p) {
    int res = 1;
    for(int i = 1; i <= p; i++){
    res = res * n;
    }
    return res;
}
}
