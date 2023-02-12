
package BasicNumbersProgramming;
import java.util.Scanner;

//WAP to print all the digits of the number.
class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int d = n % 10;
            System.out.println(d);
            n = n/10;
        }
        sc.close();
    } 
}
