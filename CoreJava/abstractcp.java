package CoreJava;
/*Abstraction = The process of displaying what is required and hiding what is not required. */
//Rules for abstract method
/*
 * 1) Abstract method should have 'abstract' keyword.
 * 2) It should end with a semicolon
 * 3) There shouldn't be any body for the abstract method.
 * 4) If there is any abstract method inside a class then the class should also be a abstract class.
 * (Abstract class is achieved by the help of 'abstract' keyword)
 */

abstract class AbsClass {
    abstract public void login();//abstract method IMP(In Java abstraction of a static method is not possible)
    /*abstract method cannot be instantiate so it cannot be accessed */
    public void StatMethinAbsCls(){
        System.out.println("Static Method in Abstract Class");
    }
}
class Cls1 extends AbsClass{
    public void login(){//concrete method 
        System.out.println("Normal/Concrete Method");
    }

}
class abstractcp{
    public static void main(String[] args) {
        Cls1 ref = new Cls1();
        AbsClass ref2 = new Cls1();//UpCasting
        ref.login();//subclass concrete method.
        ref2.StatMethinAbsCls();//overrides abstract class and calls construct class.
    }
    /*Rules for abstraction
     * 1)We cannot create an object for abstract class but we can create a reference variable.
     * 1)If there is any class that inherits an abstract class then the said class should also be an abstract class.
     * (To avoid having both parent and child class as abstract.The child/sub class should have an concrete method with the same name 
     * so that it overrides the abstract method during runtime binding)
     */
    /*
     * Characteristics of abstract and Normal/Concrete class
     * 1)Concrete class can have all the members i.e static/non-static var,method,block but it cannot have an abstract method.
     * 2)Abstract class can have all the members + abstract method.
     */

     /*Drawbacks of abstract class 
      *1) 100% Abstraction is not possible 
      (100% Abstraction can be achieved with the help of interface.)
     */

}