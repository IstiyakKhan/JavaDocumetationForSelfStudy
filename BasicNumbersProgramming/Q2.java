package BasicNumbersProgramming;
//JAP to print largest of 3 numbers

class Q2 {
    public static void main(String[] args) {
        num(12,31,0);
    }
    public static void num(int a, int b, int c){
        if(a > b){
            System.out.println(a);
        }
        if(b > c){
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
