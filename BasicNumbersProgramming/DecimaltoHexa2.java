package BasicNumbersProgramming;
class DecimaltoHexa2 {
    public static void main(String[] args) {
        int n = 178;
        String res = "";
        while(n != 0){
            int r = n % 16;
            if(r == 10){
                res = "a" + res;
            }
            else if(r == 11){
                res = "b" + res;
            }
            else if(r == 12){
                res = "c" + res;
            }
            else if(r == 13){
                res = "d" + res;
            }
            else if(r == 14){
                res = "e" + res;
            }
            else if(r == 15){
                res = "f" + res;
            }
            else{
                res = r + res;
            }
            n = n /16;
        }
        System.out.println(res);
    }    
}
