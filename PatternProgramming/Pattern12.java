package PatternProgramming;

public class Pattern12 {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		for(int r = 1; r <= n; r++) {
			for(int c = 1; c <= n; c++) {
				if(r >= c) {
					System.out.print(i++ + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
