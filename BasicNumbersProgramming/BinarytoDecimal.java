//Sum of every digit of the binary multiplied by the base value of decimal with the power of 0 incrementing with every loop
package BasicNumbersProgramming;
class BinarytoDecimal {

        public static void main(String[] args) {
            int n = 1110;
            int sum = 0;
            int k = 0;
            while(n!=0){
                int d = n % 10;
                sum = sum + d * power(2, k++);//k++ to increment the power with every loop
                n = n /10;
            }
            System.out.println(sum);
        }

    public static int power(int n, int p) { 
        int res = 1;
        for(int i = 1; i <= p; i++){
        res = res * n;
        }
        return res;
    }

}
