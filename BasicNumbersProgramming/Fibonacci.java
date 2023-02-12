package BasicNumbersProgramming;

import java.util.Scanner;

public class Fibonacci {
    
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the Range : ");
            int range = sc.nextInt();
            while(range < 3) {
            	System.out.print("Range Should be Greater than 2 : ");
            	range = sc.nextInt();
            }
            int a = 0;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            for(int i = 1; i <= range-2; i++){
                int c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
            sc.close();
            }
        }    