package BasicNumbersProgramming;
//WAP to find out strong number.
//Strong Number is a number whose sum of the factorial of digits is equal to the original number.
public class StrongNum {
    public static void main(String[] args) {
        
    int n = 24;
    int temp = n;
    int sum = 0;
    while(n != 0){
        int d = n % 10;
        int f = 1;
        n = n /10;
        for(int i = 1; i <= d; i++){
        f = f * i;
        }
        sum = sum + f;
}
    if(sum == temp){
        System.out.println("Strong Number");
    }else{
        System.out.println("Not a Strong Number");
    }
    }
}
