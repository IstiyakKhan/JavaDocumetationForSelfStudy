package LCEasy;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        boolean palindrome = true;
        System.out.print("Enter Length : ");
        int len = sc.nextInt();
        int k = 1;
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Element " + k++ + ": ");
            int input = sc.nextInt();
            ll.add(input);
        }
        System.out.println(ll);


        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        for (int i = ll.size()-1; i >= 0; i--) {
            ll2.add(ll.get(i));
        }
        System.out.println(ll2);

        for (int i = 0; i < ll2.size(); i++) {
            if(ll.get(i) != ll2.get(i)){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome Linked List");
        }
        else {
            System.out.println("Not a Palindrome Linked List");
        }
    }
}
