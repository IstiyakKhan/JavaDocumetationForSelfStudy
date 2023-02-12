package BasicNumbersProgramming;
//AP to reverse the number and store inside a variable

class Reverse {
    public static void main(String[] args) {
        int n = 123;
        //System.out.println(Integer.reverse(n));
        int rev = 0;
        while(n != 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n = n/10;
        }
        System.out.println(rev);
    }
}
