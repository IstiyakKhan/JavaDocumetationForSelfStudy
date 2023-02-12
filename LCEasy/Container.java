package LCEasy;

public class Container {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int width = j - i;
                sum = Math.max(sum,Math.min(a[i],a[j]) * width);
            }
        }
        System.out.println(sum);
    }
}
