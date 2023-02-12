package CoreJava;
import java.util.PriorityQueue;

/*
 * Queue = It is an interface with implementing classes LinkedList and PriorityQueue
 * 
 */

class CollectionQueue {
    public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    q.add(1);
    q.add(4);
    q.add(5);
    q.add(2);
    q.add(3);

    System.out.println(q);
    System.out.println(q.peek());
    q.remove(3);
    System.out.println(q);
    System.out.println(q.poll());
    }
}
