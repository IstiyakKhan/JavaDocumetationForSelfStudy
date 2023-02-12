package BasicNumbersProgramming;
public class DecimaltoHexa {
    public static void main(String[] args) {
        int n = 178;
        String res = "";
        char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'}; 
        while(n != 0){
            int rem = n % 16;
            res = hexa[rem] + res;
            n = n / 16;
            
            }
            System.out.println(res);
        }

    }

