package CoreJava;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * Differences of Set from List
 * 1) Doesn't allow Duplicate objects and only one null object allowed.
 * 2) No Random Access
 * 3) No FIFO and LILO insertion order.
 * 4) Doesn't maintains index.
 * 5) Adding/Removing with index is not possible
 * 6) Only Iterator and for each loop to access objects
 */
/*
 * HashSet = It is a implementing class of Set Interface.
 * Characteristics of HashSet
 * 1) Doesn't maintain insertion order.
 * 2) Heterogenous objs are allowed
 * 3) Only one null object is allowed
 */
class CollectionSet {
    public static void main(String[] args) {
    HashSet<Object> hs = new HashSet<>();
    hs.add(true);
    hs.add(12);
    hs.add(12);//Omitted because duplicate obj
    hs.add("String");
    hs.add(null);
    hs.add(12.2);
    System.out.println("HashSet : " + hs);

    hs.remove(12);
    System.out.println(hs);


/* LinkedHashSet = It is a implementing class of Set Interface.
 * Differences of LinkedHashSet from HashSet and TreeSet
 * 1) Maintains Insertion Order
 */

    LinkedHashSet<Object> lhs = new LinkedHashSet<>();
    lhs.add(true);
    lhs.add(12);
    lhs.add(12);//Omitted because duplicate obj
    lhs.add("String");
    lhs.add(null);
    lhs.add(12.2);

    System.out.println("LinkedHashSet : " + lhs);


/* TreeSet = It is a implementing class of TreeSet.
 * Differences of TreeSet from Hashset and LinkedHashSet
 * 1) Stores Objs by default in ASC order.
 * 2) No null Obj is allowed.
 * 3) Only homogenous objs.
 */
    
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(1);
    ts.add(12);
    ts.add(131);
    ts.add(-12);
    //ts.add(null); CTE
    //ts.add("hi"); CTE
    ts.add(0);
    ts.add(12);//Omitted because Duplicate obj

    System.out.println("TreeSet : " + ts);
    }
}
