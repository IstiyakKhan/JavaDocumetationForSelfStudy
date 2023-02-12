package BasicNumbersProgramming;

public class AltPrimeNumber {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i/2 ; j++) {
                    if( i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime && i !=  1){
                    count++;
                    if(count % 5 == 0){
                        System.out.println(i);
                    }
                }
            }
        }
}
