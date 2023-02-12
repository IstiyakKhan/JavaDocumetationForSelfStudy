package PatternProgramming;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and cols : ");
        int n = sc.nextInt();
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++) {
                if (n == 7) {
                    if (r == n / 2 + 1 || (r == 1 && c == n / 2 + 1) || (r == 2 && c == 3) || (r == 3 && c == 2) ||
                            (r == 2 && c == n - 2) || (r == 3 && c == n - 1) ||
                            (c == n / 2 + 1 && r > n / 2 + 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                else if (n == 5){
                    if(r == n / 2 + 1 || (c == n / 2 + 1 && r > n / 2 +1) || (r == 1 && c == n / 2 + 1)
                            || (r == 2 && c == 2)
                            || (r == 2 && c == 4)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if (n == 3){
                    if(r == n / 2 + 1 || (c == n / 2 + 1 && r > n / 2 + 1 || (r == 1 && c == n / 2 + 1))){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if (n == 9){
                    if (r == n / 2 + 1 || (r == 1 && c == n / 2 + 1) || (r == 2 && c == 3) || (r == 3 && c == 2) ||
                            (r == 2 && c == n - 2) || (r == 3 && c == n - 1) ||
                            (c == n / 2 + 1 && r > n / 2 + 1) || ( r == 4 && c == 1) || ( r == 4 && c == n)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
