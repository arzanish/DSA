import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueRecursive {

  static Queue<Integer> q = new ArrayDeque<>();

  static void Print() {
    for (Integer x : q)
      System.out.print(x + " ");
  }

  static void reverseQueue(Queue<Integer> q) {
    if (q.isEmpty())
      return;
    int d = q.peek();
    q.remove();
    reverseQueue(q);
    q.add(d);

  }

  public static void main(String args[]) {
    q = new LinkedList<Integer>();
    q.add(12);
    q.add(5);
    q.add(15);
    q.add(20);

    reverseQueue(q);
    Print();
  }

}
