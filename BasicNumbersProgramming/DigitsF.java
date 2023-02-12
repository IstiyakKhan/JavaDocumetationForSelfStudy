//WAP to print the sum of all the digits of a number only if the number is a prime number. It not then find the product of all the digits
package BasicNumbersProgramming;
class DigitsF {
    public static void main(String[] args) {
        
    int n = 37;
    int prod = 1;
    int sum = 0;
    int count = 0;
    for(int i = 1; i <= n/2; i++){
        if(n % i == 0){
            count++;
        }
        }
    while(n != 0){
        int d = n % 10;
        prod = prod * d;
        sum = sum + d;
        n = n/10;
        }
        if(count == 2){
            System.out.println("Product : " + prod);
        }
        else{
            System.out.println("Sum : " + sum);
        }
    }
}
