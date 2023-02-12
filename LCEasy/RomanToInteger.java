package LCEasy;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number : ");
        String rn = sc.nextLine();
        while(!rn.contains("I") && !rn.contains("V") && !rn.contains("X") && !rn.contains("L")
                && !rn.contains("C") && !rn.contains("M") && !rn.contains("D")){
            System.out.print("Enter Correctly : ");
            rn = sc.nextLine();
        }
        int sum = 0;
        char c[] = rn.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if(c[j] == 'V' && c[i] == 'I'){
                    sum -= 2;
                } else if (c[j] == 'X' && c[i] == 'I') {
                    sum -= 2;
                } else if (c[j] == 'L' && c[i] == 'X') {
                    sum -= 20;
                } else if (c[j] == 'C' && c[i] == 'X') {
                    sum -= 20;
                } else if (c[j] == 'D' && c[i] == 'C') {
                    sum -= 200;
                } else if (c[j] == 'M' && c[i] == 'C') {
                    sum -= 200;
                }
            }
            if(c[i] == 'I'){
                sum += 1;
            } else if (c[i] == 'V') {
                sum += 5;
            } else if (c[i] == 'X') {
                sum += 10;
            } else if (c[i] == 'L') {
                sum += 50;
            } else if (c[i] == 'C') {
                sum += 100;
            } else if (c[i] == 'D') {
                sum += 500;
            } else if (c[i] == 'M') {
                sum += 1000;
            }
        }
        System.out.println(sum);
    }
}
