/*formula = fibonacci * natural num
 *              0 * 1 = 0
 *              1 * 2 = 2
 *              2 * 3 = 6
 *              3 * 4 = 12
 *              5 * 5 = 25*/
package BasicNumbersProgramming;

import java.util.Scanner;

public class AptiProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int n = sc.nextInt();
		while(n < 2 ) {
			System.out.print("Select a bigger number : ");
			n = sc.nextInt();
		}
		int a = 0;
		int b = 1;
		int lastn = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i = 2; i <= n-1; i++) {
			int c = a + b;
			a = b;
			b = c;
			lastn = c * i;
			System.out.print(c * i + " ");
		}
		System.out.println();
		System.out.println("Last n of the number is : " + lastn);
		sc.close();
	}
}
