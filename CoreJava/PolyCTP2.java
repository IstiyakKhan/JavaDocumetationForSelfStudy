package CoreJava;
//CTP/CTBinding through method shadowing.
//Method Shadowing = Subclass and superclass having method with the same name,FA, return type and access specifier.
//(Method shadowing can only be achieved through static methods.)
class P1
{
    public static void StatMeth(){
        System.out.println("Superclass static method");
    }

}
class P2 extends P1
{
    public static void StatMeth(){
        System.out.println("Subclass static method");
    }
}
class PolyCTP2
{
    public static void main(String[] args) { 
        P1 ref = new P1();//Superclass method
        P2 ref2 = new P2();//Subclass method
        P1 ref3 = new P2();//Upcasting
        
        ref.StatMeth();
        ref2.StatMeth();
        ref3.StatMeth();
        //Which method to call is decided by the compiler during compile time with the help of reference type variable.
        //NOT DURING OBJECT CREATION!!
        //=============================//
        //Examples of CTP/CTBinding/Static
        /* 1)Variable Shadowing
         * 2)Method Shadowing
         * 3)Method Overloading
         * 4)Constructor overloading
         */
    }
}
