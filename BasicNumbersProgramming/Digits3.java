//WAP to print all the even digits in the number
package BasicNumbersProgramming;
public class Digits3 {
    public static void main(String[] args) {
        int n = 122244;
      while(n!=0){
            int d = n % 10;
            n = n/10;
            if(d % 2 == 0){
                System.out.println(d);
            }
        }
    }
}
