package CoreJava;


public class Typecasting {
    public static void main(String[] args) {
       double d = 10;
       int i = (int)d; //Narrowing. Done explicitly with the help of Typecasting Operator

       int a = 10;
       double b = a;//Widening. Done implicitly

       System.out.println(i);
        System.out.println(b);

        //There can be dataloss due to narrowing

    }
    
}
