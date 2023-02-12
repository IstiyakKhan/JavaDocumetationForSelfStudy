package CoreJava;
public class P3  {
    public static int lar_num(int a, int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int lar_num(int a, int b,int c){
        if (a > b ){
            return a;
        }
        else if (b > c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int lar_num(int a, int b,int c,int d){
        if (a > b ){
            return a;
        }
        else if (b > c){
            return b;
        }
        else if (c > d){
            return c;
        }
        else {
            return d;
        }
        }
        public static void main(String[] args){
           int res1 = lar_num(293,4);
           int res2 = lar_num(3,374,4);
           int res3 = lar_num(3,4,4,309);

           System.out.println(res2);
           System.out.println(res1);
           System.out.println(res3);

        }
    }
