import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueIterative {

  static Queue<Integer> q = new ArrayDeque<>();

  static void Print() {
    for (Integer x : q)
      System.out.print(x + " ");
  }

  static void reverseQueue() {
    Stack<Integer> s = new Stack<>();
    while (!q.isEmpty()) {
      s.add(q.peek());
      q.remove();
    }
    while (!s.isEmpty()) {
      q.add(s.peek());
      s.pop();
    }
  }

  public static void main(String args[]) {
    q = new LinkedList<Integer>();
    q.add(12);
    q.add(5);
    q.add(15);
    q.add(20);

    reverseQueue();
    Print();
  }

}
