package BasicNumbersProgramming;
//WAP to print the number raise to power result
public class PowerOfNum {
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        int res = 1;
        for(int i = 1; i <= p;i++){
            res = res * n;
        }
        System.out.println(res);
    }
}
