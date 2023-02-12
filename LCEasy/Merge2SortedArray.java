package LCEasy;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = new int[a.length + b.length];
        int posi = 0;

        for (int i = posi; i < a.length; i++) {
            c[i] = a[i];
            posi++;
        }

        System.out.println(posi);

        for (int i = 0; i < b.length; i++) {
            c[posi] = b[i];
            posi++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] +  " ");
        }
    }
}
