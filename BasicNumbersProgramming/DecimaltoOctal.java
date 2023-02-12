package BasicNumbersProgramming;
class DecimaltoOctal {
    public static void main(String[] args) {
        int n = 12;
        String res = "";
        while(n != 0){
            int rem = n % 8;
            res = rem + res;
            n = n / 8;
        }
        System.out.println(res);
    }
}
