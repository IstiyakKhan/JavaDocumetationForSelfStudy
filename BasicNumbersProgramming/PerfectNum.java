package BasicNumbersProgramming;
//Sum of the addititon of factores of the number is equal to the number.
public class PerfectNum {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        for(int i = 1; i < n; i++){
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a perfect");
        }
    }
}
