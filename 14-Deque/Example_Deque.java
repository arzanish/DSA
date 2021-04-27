import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Example_Deque {

  public static void main(String[] args) {
    Deque<Integer> d = new LinkedList<>();
    d.addFirst(10);
    d.addLast(15);
    d.addFirst(5);
    d.addLast(20);

    System.out.println(d.getFirst());
    System.out.println(d.getLast());

    System.out.println("Printing: ");
    Iterator it = d.iterator();
    while (it.hasNext())
      System.out.print(it.next() + " ");

    System.out.println();

    System.out.println("Printing in Reverse Order: ");
    it = d.descendingIterator();
    while (it.hasNext())
      System.out.print(it.next() + " ");
  }
}
