package BasicNumbersProgramming;
//WAP to check weather the number is palindrome or not.

public class Reverse2 {
    public static void main(String[] args) {
        
    int n = 121;
    int p = n;
        //System.out.println(Integer.reverse(n));
        int rev = 0 ;
        while(n != 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n = n/10;
            }
            if(p == rev){
                System.out.println("Palindrome Number");
            }else{
                System.out.println("Not Palindrome");
            }
        }
}
