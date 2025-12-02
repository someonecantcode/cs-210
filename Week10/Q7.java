import java.util.*;

public class Q7 {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(findMid(list));
  }

  public static int findMid0(LinkedList<Integer> l) {
    int size = 0;

    Iterator<Integer> it = l.iterator();
    while (it.hasNext()) {
      it.next();
      size++;
    }

    return l.get((size - 1) / 2);
  }

  public static int findMid1(LinkedList<Integer> l) {
    if(l.peekFirst() == null) {
      return -1;
    }
    int m1 = 0;

    while (l.peekFirst() != null) {
      m1 = l.removeFirst();

      if (l.peekLast() != null) {
        l.removeLast();
      }

    }

    return m1;
  }

  public static int findMid(LinkedList<Integer> list) {
    // slow fast method
    if (list.isEmpty()) {
      return -1;
    }

    Iterator<Integer> slow = list.iterator();
    Iterator<Integer> fast = list.iterator();

    int midValue = slow.next(); // start with first element
 
    // 1 2 3 4
    // slow.next -> 1
    
    /* loop
        fast.next -> 1
        fast.next does has next -> 2
        mid -> 2

        fast.next -> 2
        fast.next does has next -> 3
        mid -> 3
        
        fast.next -> 4
        exit

        mid -> 3
     */
    while (fast.hasNext()) {
      fast.next(); // move fast one step
      if (fast.hasNext()) {
        fast.next(); // move fast second step
        midValue = slow.next(); // move slow one step
      }
    }

    return midValue;
  }
}