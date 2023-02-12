package LCEasy;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int count = 5;
        int iter = SqrtSum(n);
        boolean checker = false;

        while(count > 0){
            int sum = SqrtSum(iter);
            if(sum != 0) {
                iter = SqrtSum(sum);
                count = count - 1;
            }
            if (iter == 1) {
                checker = true;
                break;
            }
            else {
                checker = false;
            }
        }
        if(checker){
            System.out.println("Happy Number");
        }else {
            System.out.println("Not a Happy Number");
        }
    }
    public static int Sqrt(int n){
        int res = 1;
        res = n * n;
        return res;
    }
    public static int SqrtSum(int n){
        int sum = 0;
        while (n != 0){
            int d = n % 10;
            sum += Sqrt(d);
            n = n / 10;
        }
        return sum;
    }
}
