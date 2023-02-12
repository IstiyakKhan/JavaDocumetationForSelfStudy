package BasicNumbersProgramming;
//JP to to swap two numbers
class Q1 {
    public static void main(String[] args) {
        //Swapping without a third variable
        int a = 10,b = 12;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        swap(12,22);
       
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
