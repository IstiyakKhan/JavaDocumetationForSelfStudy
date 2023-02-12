package CoreJava;
/*
 * toString Method = It is a non static method inside object class.It returns the address of an object in String format.
 * 
 * Why do we need to override toStringMethod ?
 * If we want to print the data of an object instead of address.
 * toStringMethod is called internally whenever we want to print the reference of an object.
 */

public class toStringMeth {

    int a;
    int b;
    toStringMeth(int a, int b){
        this.a =a;
        this.b = b;

    }

    public String toString(){//method overriding 
        System.out.println(a);
        System.out.println(b);
        return "";
    }

    public static void main(String[] args) {
        toStringMeth sm = new toStringMeth(12,40);
        System.out.println(sm);
        toStringMeth sm2 = new toStringMeth(21, 41);
        System.out.println(sm2);
    }
}
