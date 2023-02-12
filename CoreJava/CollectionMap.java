package CoreJava;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * Map = It is a data structure where data is stored in the form of key and value pair.
 * It is an interface which has implementing classes HashMap,LinkedHashMap and TreeMap.
 */


 /*
  * HashMap = It is a implementing class of Map Interface.
  Characteristics of HashMap
  1) Doesn't maintains insertion order.
  2) Heterogenous Keys are allowed.
  3) Duplicate keys are not allowed.
  */
class CollectionMap {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
        hm.put(1, "Sunny");
        hm.put(2, "Deepak");
        hm.put(null, "Manas");
        hm.put(4, "Deepak");
        hm.put('a', null);
        hm.put('b', null);
        hm.put(null, true);//Previous value will be replaced with current value.

        System.out.println("HashMap : " + hm);

    /*
     * LinkedHashMap = It is a implemeting class of Map Interface
     * Differences of LinkedHashMap from HashMap
     * 1) Maintains Insertion Order
     */

     LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();

        lhm.put(1, "Sunny");
        lhm.put(2, "Deepak");
        lhm.put(null, "Manas");
        lhm.put(4, "Deepak");
        lhm.put('a', null);
        lhm.put('b', null);
        lhm.put(null, true);//Previous value will be replaced with current value.
        lhm.remove(2);//method for removing in HashMap
        System.out.println(lhm.containsKey(2));
        System.out.println(lhm.containsValue("Manas"));
        
        System.out.println("LinkedHashMap : " + lhm);

    /*
     * TreeMap = It is a implementing class of Map Interface
     * Differences of TreeMap from HashMap and LinkedHashMap
     * 1) Stores keys in ASC order by default.
     * 2) Only homogenous keys are allowed.
     * 3) No Duplicate key is allowed.
     */

     TreeMap<Integer, Object> tm = new TreeMap<>();
     tm.put(1, null);
     tm.put(3,"Deepak");
     tm.put(5, "Sunny");
     tm.put(2, true);
     tm.put(2, "Bharti");//Previous value will be replaced with current value.
     tm.put(4, "l");
    

     System.out.println("TreeMap : " + tm);

    }
    
}
