package LCEasy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "manas madarchod hai";
        String[] a = s.split(" ");
        int count = 0;
        String word = "";
        for (int i = a.length-1; i >= 0; i++) {
            word = a[i];
            char[] c = word.toCharArray();
            for (int j = 0; j < c.length; j++) {
                count++;
            }
            break;
        }
        System.out.println(count);
    }
}
