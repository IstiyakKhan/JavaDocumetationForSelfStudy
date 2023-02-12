package LCEasy;

public class SearchInseartPosi {
    public static void main(String[] args) {
        int[] a = {1,2,6,8};
        int search = 5;

        System.out.println(LinearSearch(a,search));

    }
    public static int LinearSearch(int[] a, int search){
        int index = 0;
        boolean present = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == search){
                index = i;
                present = true;
            }
        }
        if(present == false){
            index = a.length;
        }
        return index;
    }
}
