package LCEasy;

public class PlusOne {
    public static void main(String[] args) {
        int[] a = {1,1,9};
        String num = "";
        for (int i = 0; i < a.length; i++) {
            num += a[i] + "";
        }
        int numint = Integer.parseInt(num);
        numint = numint + 1;
        int[] newarr = new int[Count(numint)];
        for (int i = newarr.length-1; i >= 0; i--) {
            while(numint != 0){
                int d = numint % 10;
                numint = numint / 10;
                newarr[i] = d;
                break;
            }
        }

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    public static int Count(int n){
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
