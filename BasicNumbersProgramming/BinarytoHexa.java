package BasicNumbersProgramming;

public class BinarytoHexa {
	public static void main(String[] args) {
		int b = 10110010;
		int sum = 0;
		int p = 0;
		while(b != 0) {
			int d = b % 10;
			b = b / 10;
			sum = sum + d * power(2, p++);
		}
		
		//char[] hexa = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
		String hex = "";
		while(sum != 0) {
			int d = sum % 16;
			if(d == 10){
                hex = "A" + hex;
            }
            else if(d == 11){
                hex = "B" + hex;
            }
            else if(d == 12){
                hex = "C" + hex;
            }
            else if(d == 13){
                hex = "D" + hex;
            }
            else if(d == 14){
                hex = "E" + hex;
            }
            else if(d == 15){
                hex = "F" + hex;
            }
            else {
            	hex = d + hex;
            }
			sum = sum / 16;
		}
		System.out.println(hex);
		
	}
	public static int power(int n, int p) {
		int res = 1;
		for(int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}
