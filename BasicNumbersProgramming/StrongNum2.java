package BasicNumbersProgramming;
//WAP to find strong number between 1 and 1000;
//Strong Number is a number whose sum of the factorial of digits is equal to the original number.
public class StrongNum2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 1000; i++){
            int n = i;
            int sum = 0;
            int temp = n;

            while(n != 0){
                int d = n % 10;
                n = n / 10;

                int fact = 1;
                for(int f = 1; f <= d; f++){
                    fact = fact * f;
                }
                sum = sum + fact;
            }
                if(sum == temp){
                    System.out.println(temp);
                }

            n = temp;
            
        }
    }
}