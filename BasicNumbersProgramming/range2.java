package BasicNumbersProgramming;
import java.util.Scanner;

class range2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = 0;
        long a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            if(i % 2 == 0){
                count++;
            }
    }
    System.out.println(count);
    sc.close();
}
}
