package LCEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ToFindAsciiValDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern(ex = abba) : ");
        String inp = sc.nextLine();
        System.out.print("Enter String(Should be Seperated With Spaces) : ");
        String s = sc.nextLine();
        ArrayList<Integer> ar = diff(inp);
        System.out.println(Res(ar,s));

    }
    public static ArrayList<Integer> diff(String pattern){
        char[] a = pattern.toCharArray();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int pattern_diff = 0;
        for (int i = 0; i < a.length; i++) {
            ar.add((int)a[i]);
        }
        ArrayList<Integer> dif = new ArrayList<Integer>();
        dif.add(0);

        for (int j = 1; j < ar.size(); j++) {
            while(j < ar.size()){
                dif.add(ar.get(j) - ar.get(j-1));
                break;
            }
        }
        return dif;
        //System.out.println(dif);
    }
    public static boolean Res(ArrayList<Integer> ar, String s){
        String[] sa = s.split(" ");
        if(sa.length != ar.size()){
            return false;
        }
        ArrayList<Integer> str = new ArrayList<Integer>();
        str.add(0);
        for (int i = 1; i < sa.length; i++) {
            while(i < sa.length){
                str.add(sa[i].charAt(0) - sa[i-1].charAt(0));
                break;
                }
        }
        boolean result = false;
        if(str == ar){
            result = true;
        }
        System.out.println("Explanation");
        System.out.println("=============================");
        System.out.println(ar);
        System.out.println(str);
        System.out.println("=============================");
        System.out.print("Result : ");
        return result;
    }
    }
