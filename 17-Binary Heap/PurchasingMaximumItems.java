import java.util.PriorityQueue;

public class PurchasingMaximumItems {
  static int maxItems(int[] arr, int sum) {
    int count = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      pq.add(arr[i]);
    }
    while (pq.isEmpty() == false) {
      if (pq.peek() <= sum) {
        sum -= pq.poll();
        count++;
      } else
        break;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] cost = { 20, 10, 5, 30, 100 };
    int sum = 35;
    System.out.print(maxItems(cost, sum));
  }
}
