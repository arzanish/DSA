import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElements {

  static void kLargest(int[] arr, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      pq.add(arr[i]);
    }
    for (int i = k; i < arr.length; i++) {
      if (pq.peek() > arr[i])
        continue;
      else {
        pq.poll();
        pq.add(arr[i]);
      }
    }

    Iterator i = pq.iterator();
    while (i.hasNext()) {
      System.out.print(i.next() + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
    kLargest(arr, 3);
  }
}
