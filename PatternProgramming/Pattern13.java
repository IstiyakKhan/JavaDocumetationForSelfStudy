package PatternProgramming;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 9;
		for(int r = 1; r <= n; r++) {
			for(int c = 1; c <= n; c++) {
				if(r == 1 || c == n/2+1 || r == n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int r = 1; r <= n; r++) {
			for(int c = 1; c <= n; c++) {
				if(c == 1 || (c == n && r == 1) || (c == n-1 && r == 1+1) || (c == n-2 && r == 1+2)
						|| (c == n-1 && r == n-1) || (c == n && r == n)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
