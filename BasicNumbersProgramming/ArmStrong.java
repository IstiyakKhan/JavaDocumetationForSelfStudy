package BasicNumbersProgramming;
//Armstrong number is a number whose sum of the digits raised to the power of (count of digits) is equal to the number itself.

class ArmStrong {
	public static void main(String[] args) {
		for(int r = 1; r <= 10000; r++) {
		int n = r;
		int count = CountofNum(n);
		int sum = 0;
		int temp = n;
		while(n != 0) {
			int d = n % 10;
			sum = sum + power(d, count);
			n = n / 10;
		}
		if(temp == sum) {
			System.out.println(temp);
		}
		
		n = temp;
		}
		
		
	}
	public static int power(int n, int p) {
		int res = 1;
		for(int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
	public static int CountofNum(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n = n / 10;
			
		}
		return count;
	}
}