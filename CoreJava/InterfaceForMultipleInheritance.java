package CoreJava;

/*In Java multiple inheritance is not possile with class type because of Diamond Problem hence to achieve multiple inheritance 
 * interface type is used.
 * Diamond Problem that occuers in multiple inheritance of class
 * 1) Class Loading Process : Confusion of which superclass to load first.
 * 2) Object Loading Process : Confusion of which superclass constructor to call first.
 * 3) Accessing Members : Confusion of which member to call if both class have a member with the same name.
 * 
 * 
                                (Class can only implement interface not extend) 

To inherit interface to interface "extend" keyword must be used.
TO inherit class to interface "implement" keyword must be used.
*/
interface I1 {
    void test2();//abstract method
}
interface I2 {
    void test2();//abstract method
}
class C1 implements I1,I2{ //Multiple Inheritance
    public void test2(){
        System.out.println("Concrete Method");
    }

}
class InterfaceForMultipleInheritance{
    public static void main(String[] args) {
        I1 i = new C1();
        i.test2();//Overriding absract method
    }
}
/*
 * To inherit more than 1 superclass "implements" keyword is used
 * The problems that arrises by undergoing multiple inheritance with class is fixed in interface type.
 * 1) Class Loading Process = implement keyword implememts the interface which is written first i.e in line no 12, I1 will be implemented 
 * first then I2 .
 * 2) Object Loading Process = We cannot create an object for the interface hence OLP will be fixed by default
 * 3) Accessing Members = Only abstract method is allowed in interface which is can be overriden.
 */