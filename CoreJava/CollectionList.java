package CoreJava;

/*
Characteristics of List
 * 1) It is HeteroGenoues.
 * 2) It is of Growable type.
 * 3) Maintains index order.
 * 4) Maintains FIFO, LILO insertion order.
 * 4) Random access, Duplicate Objects, Null Objects are allowed.

 ArrayList = It is a implementing class of the List Iterface.
 * (Characteristics of ArrayList is same as List)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

class CollectionList {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add("Hi");
        a.add(33);
        a.add(43.3);
        a.add(false);
        a.add(null);
        a.add(33);
        System.out.println("ArrayList : " + a);
        System.out.println(a.get(3));//method to access objects(get(index))
        a.remove(3);
        System.out.println(a.get(3));

        System.out.println("=======================================");


        for(int i = 0; i < a.size() ; i++){
            System.out.println(a.get(i));
        }

        System.out.println("=======================================");//method to access objects(for-each loop)

        for (Object object : a) {
            System.out.println(object);
        }

        System.out.println("=======================================");//method to access objects(Iterator)
        /*Iterator interface has 2 methods
         * 1) next() = Accesses the current obj and shifts the cursor to next obj in forward direction
         * 2) hasNext() = Checks wheather the list has next obj or not
         */

        Iterator<Object> it = a.iterator();
        while(it.hasNext()){
            System.err.println(it.next());
        }

        System.out.println("=======================================");//method to access objects(ListIterator)
        /*
         * ListIterator has 4 methods
         * 1) next() = Access the current obj and shift the cursor to next obj in forward direction
         * 2) hasNext() = Checks wheather the list has next obj or not
         * 3) previous() = Access the current obj and shift the cursor to next obj in forward direction
         * 4) hasPrevious() = Checks wheather the list has any previous obj or not 
         */

        ListIterator<Object> itp = a.listIterator();
        while(itp.hasPrevious()){
            System.out.println(itp.previous());
        }


        ArrayList<Object> a2 = new ArrayList<>();
        a2.add(311);
        a2.addAll(1, a);
        System.out.println("ArrayList : " + a2);
        System.out.println(a2.get(3));
        a2.add(3,"new");
        System.out.println(a2.get(3));
        a.clear();//method to remove obj(clear())


        ArrayList<Object> a3 = new ArrayList<>();
        a3.addAll(0, a);
        System.out.println("ArrayList : " + a3);
        System.out.println(a3.contains(33)); //method to seacrh obj
        System.out.println(a3.containsAll(a2)); //method to seacrh obj

        CollectionLinkedList.lL();
        CollectionVector.Vector();

        ArrayList<Integer> a4 = new ArrayList<>();
        a4.add(32);
        a4.add(342);
        a4.add(-33);
        a4.add(13);
        a4.add(11);
        a4.add(0);
        a4.add(-1);


        /*
         * Sorting
         * Collections is a class inside java.util.package
         * It has 2 static methods
         * 1) sort()
         * 2) reverse()
         */
        Collections.sort(a4);//Sorting 
        System.out.println("ASC : " + a4);
        Collections.reverse(a4);//Reverse Sorting
        System.out.println("DESC : " + a4);

    }

    
}

/*
 * LinkedList = It is a implementing class of the List and Queue Interface.
 * Differences of LinkedList from ArrayList
 * 1) It follows doubly list structure.
 * 2) It stores objects in the form of node.
 * 3) Doesn't have Initial and Incremental Capacity.
 * 4) Good for adding and removing of objects.
 * 5) Not good for accessing and searching of objects.
 * 6) Doesn't have shifting operation
 */
class CollectionLinkedList{

    public static void lL(){
        LinkedList<Object> l = new LinkedList<>();
        l.add(true);
        l.add("Hi");
        l.add(13.0);
        l.add(true);
        l.add(null);
        l.add(31);

        System.out.println("Linked List : " + l);
    }

    }
    
    /*
     * Vector = It is a implementing class of List Interface
     * Differences of Vector from ArrayList
     * 1) Vector is from JDK 1.0
     * 2) It is considered a legacy class
     * 3) Vector has a incremental capacity of 100% and is considered slower than ArrayList
     */

class CollectionVector{
    public static void Vector(){
        Vector<Object> v = new Vector<>();
        v.add("Hi");
        v.add(31);
        v.add(true);
        v.add(true);
        v.add(43.3);
        v.add(null);

        System.out.println("Vector : "+ v);
    }
}


