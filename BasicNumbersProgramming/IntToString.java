package BasicNumbersProgramming;


public class IntToString {
	public static void main(String[] args) {
		int i = 912123113; 
		int rev = 0;
		while(i != 0) {
			int d = i % 10;
			rev = rev*10 + d;
			i = i /10;
		}
		while(rev != 0) {
			int d = rev % 10;
			if(d == 1) {
				System.out.println("one");
			}
			else if (d == 2){
				System.out.println("two");
			}
			else if (d == 3){
				System.out.println("three");
			}
			else if (d == 4){
				System.out.println("four");
			}
			else if (d == 5){
				System.out.println("five");
			}
			else if (d == 6){
				System.out.println("six");
			}
			else if (d == 7){
				System.out.println("seven");
			}
			else if (d == 8){
				System.out.println("eight");
			}
			else if (d == 9){
				System.out.println("nine");
			}
			else{
				System.out.println("zero");
			}
			rev = rev/10;
		}
	}
}
