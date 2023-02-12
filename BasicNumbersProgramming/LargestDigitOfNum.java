//WAP to find largest digit of a number
package BasicNumbersProgramming;
public class LargestDigitOfNum {
    public static void main(String[] args) {
        int n = 32948;
        int largestNum = 0;
        while(n != 0){
            int d = n % 10;
            n = n/10;
            // largestNum = Math.max(largestNum, d);
            if(largestNum < d){
                largestNum = d;
            }
        }
        System.out.println(largestNum);
    
        
    }
}
