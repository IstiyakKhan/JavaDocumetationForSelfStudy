package CoreJava;
/*Interface for Abstraction = 100% of abstraction is not possible by creating an abstract class but we can store abstract as
well concrete method. To achieve 100% abstract interface is used.
(Interface is a key used to achieve Non Primitive datatype)
*/
/*                                  Characteristics of Interface
 *  1) Only abstract method is allowed inside interface.
 *  2) We can't create object for an interface but creating refernce variable is possible
 */
interface Abs{//100% Abstraction Achieved
     void test(); //abstract method
}
class A1 implements Abs{
     public void test(){
        System.out.println("Concrete Method");//overrides abstract method
     }
}
class InterfaceForAbstraction{
    public static void main(String[] args) {
        Abs a = new A1();
        a.test();
    }
}
/*
 * Interface by default gives abstract and public prefix to a method hence writing abstract prefix is not necessary but can be written 
 * if wanted.
 */