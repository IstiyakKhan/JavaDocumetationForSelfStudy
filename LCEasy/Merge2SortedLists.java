package LCEasy;

import java.util.ArrayList;

public class Merge2SortedLists {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(4);

        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        ar2.add(1);
        ar2.add(3);
        ar2.add(4);



        ArrayList<Integer> merge = new ArrayList<Integer>();
        for (int i = 0; i < ar.size(); i++) {
            if(ar.get(i) == ar2.get(i)){
                merge.add(ar.get(i));
                merge.add(ar2.get(i));
            }
            if(ar.get(i) > ar2.get(i)){
                merge.add(ar2.get(i));
                merge.add(ar.get(i));
            }
            if(ar.get(i) < ar2.get(i)) {
                merge.add(ar.get(i));
                merge.add(ar2.get(i));
            }
        }
        if(ar.size() == 0){
            merge.addAll(ar2);
        } else if (ar2.size() == 0) {
            merge.addAll(ar);
        }

    }
}
