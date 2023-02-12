package LCEasy;

public class Sqrt {
    public static void main(String[] args) {
        int a = 8;
        int count = 0;

        for (int i = 1; i <= a ; i++) {
            if(a % i == 0){
                boolean isPrime = true;
                for(int j = 2; j <= i/2 ; j++){
                    if(i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime && i != 1){
                    count++;
                    if(count == 1){
                        System.out.println(i);
                    }
                }
            }
        }

    }
}
