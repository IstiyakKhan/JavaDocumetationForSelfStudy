package CoreJava;
//CTP/CTBinding through variable shadowing.
//Variable shadowing = Subclass and superclass having static or non static var with the same name.
class A{
     int a = 10;
}
class C2 extends A{
      int a = 14;
}
class PolyCTP{
    public static void main(String[] args) {
        C2 ref = new C2();
        System.out.println(ref.a);//subclass 
        A ref1 = new C2();
        System.out.println(ref1.a);//upcasting //Compilers finds variable in reference type class 
        A ref2 = new A();
        System.out.println(ref2.a);//superclass //only 1 int present hence a = 10

    }
}