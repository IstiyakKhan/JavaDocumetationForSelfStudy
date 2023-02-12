package CoreJava;
/*
 * equals Method = It is a non-static method defined inside Object class. It is used to compare address of two objects.
 * Why do we need to override equals Method?
 * When we want to compare the data of the 2 objects rather than the address.
 * Note = We can change the behaviour of equals method but we cannnot change the behaviour the equals operator.
 */



public class equalsMeth {
    int i = 10;
    public boolean equals(equalsMeth ref){
        return this.i == ref.i;
    }    
    public static void main(String[] args) {
        equalsMeth ref1 = new equalsMeth();
        equalsMeth ref2 = new equalsMeth();
        System.out.println(ref1 == ref2);
        System.out.println(ref1.equals(ref2));

    }
}
