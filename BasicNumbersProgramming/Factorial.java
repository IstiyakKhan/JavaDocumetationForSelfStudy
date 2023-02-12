//Product of an integer and all the integers below it is known as Factorial.
//WAP to find out factorial of a number
package BasicNumbersProgramming;
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int Factorial = 1;
        for(int i = 1; i <= n; i++){
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);

    }
}