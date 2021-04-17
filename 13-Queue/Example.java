import java.util.*;

class Example {
  public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    java.util.Queue<Integer> q = new ArrayDeque<Integer>();

    q.offer(10);
    q.offer(20);
    q.offer(30);

    System.out.println(q.peek());
    System.out.println(q.poll());
    System.out.println(q.peek());
  }
}