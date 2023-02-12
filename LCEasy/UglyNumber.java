package LCEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        boolean cond = false;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int maxnum = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                boolean isPrime = true;
                for(int j = 2 ; j <= i / 2; j++){
                    if(i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime && i != 1){
                    ar.add(i);
                }
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            if(ar.get(i) > maxnum){
               maxnum = ar.get(i);
            }
        }
        if(maxnum == 2 || maxnum == 3 || maxnum == 5){
            cond = true;
        }
        else {
            cond = false;
        }
        System.out.println(cond);
    }
}
