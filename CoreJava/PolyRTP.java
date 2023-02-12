package CoreJava;

//RTP/RTBinding happens during run time.
//Method overriding is the only example for RTP.
//Method overriding = Superclass and subclass having NON-STATIC method with the same name,FA,return type and access specifier.
//In Method overriding old address of the method is replaced by the new address.

class  SupC {
    public void NoStatMeth(){
        System.out.println("Non static superclass method");
    }
}
class SubC extends SupC{
    public void NoStatMeth(){
        System.out.println("Non static subclass method");
    }
}
class PolyRTP{
    public static void main(String[] args) {
        SupC ref = new SupC();//Superclass Obj
        SubC ref2 = new SubC();//Subclass Obj
        SupC ref3 = new SubC();//Upcasting 

        ref.NoStatMeth();//NonStaticSuperclassMethod
        ref2.NoStatMeth();//NonStaticSubclassMethod
        ref3.NoStatMeth();//NonStaticSubclassMethod

        //Examples of RTP/RTbinding/Exception
        //1)Method Overriding
    }
}
