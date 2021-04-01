import java.util.HashMap;

public class LongestSubArrGivenSum {

  static int find(int[] arr, int sum) {
    int n = arr.length;
    int pre_sum = 0;
    int res = 0;
    HashMap<Integer, Integer> hs = new HashMap<>();
    for (int i = 0; i < n; i++) {
      pre_sum += arr[i];
      if (pre_sum == sum)
        res = i + 1;
      if (hs.containsKey(pre_sum - sum) == false)
        hs.put(pre_sum, i);
      if (hs.containsKey(pre_sum - sum))
        res = Math.max(res, i - hs.get(pre_sum - sum));
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 5, 2, 7, 1, 9 };
    System.out.print(find(arr, 15));
  }

}
