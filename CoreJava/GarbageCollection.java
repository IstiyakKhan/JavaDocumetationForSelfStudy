package CoreJava;


/*
Garbage Collection = The process of collection, deleting or removing any unused object.
 */

/*
What is an unused Object ?
--> Anonymous Object = When we create an object, but we don't set an identifier or reference variable to the said object.
Thus, the object can only be used once and after then it becomes unusable

--> Nullifying an Object = When we create an object with a reference and then re-initialized the address of the said
object to null. It becomes a null object because it doesn't the reference to the object doesn't have the address of the
object.

--> Assigning the reference of one object into another = Suppose we create two objects and inside the reference var of
first object we store the address of the second object. Thus whenever we call the first object it points towards
another object

 */
public class GarbageCollection {
    int a = 12;
    public static void main(String[] args) {

        new GarbageCollection(); //anonymous object.

        GarbageCollection ref = new GarbageCollection();
        ref = null; //nullifying the object
        System.out.println(ref);

        GarbageCollection ref1 = new GarbageCollection();
        GarbageCollection ref2 = new GarbageCollection();
        ref1 = ref2; //assigning the reference of one object into another

        System.out.println(ref1);
        System.out.println(ref2);
        System.gc();

    }
    protected void finalize(){
        System.out.println("Performing Cleanup Activites");
    }
}
/*
Garbage Collector method gc() is a static method inside System class, which is used to collect, remove or delete any
unused object.
 */
