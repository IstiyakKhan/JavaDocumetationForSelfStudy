//WAP to print the sum of all the digits of a number
package BasicNumbersProgramming;
 class Digits2 {
    public static void main(String[] args) {
        int n = 133352;
        int sum = 0;
        int prod = 1;
      while(n!=0){
            int d = n % 10;
            System.out.println(d);
            sum = sum+d;
            prod = prod * d;

            n = n/10;
    }
        System.out.println("Sum : " + sum);
        System.out.println(prod);
}
}
