package CoreJava;
public class cal {
    public static int multi1(int a, int b){
        int c = a * b;
        return c;
    }
    public static int multi2(int a, int b, int c){
        int d = a * b * c;
        return d;
    }
    public static int multi3(int a, int b, int c, int d){
        int e = a * b * c * d;
        return e; 
    }
    public static int multi4(int a, int b, int c, int d, int e){
        int f = a * b * c * d * e;
        return f;
    }
    public static void main(String[] args){
        int a = multi1(3,4);
        int b = multi2(5,3,2);
        int c = multi3(3,4,2,4);
        int d = multi4(4,32,5,3,4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


}
