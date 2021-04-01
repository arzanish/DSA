public class MaxSubArraySum {
  // KADANE's ALOGORITHM
  public static int maxSubArraySum(int[] arr, int n) {
    int res = arr[0];
    int maxend = 0;
    for (int i = 0; i < n; i++) {
      maxend = Math.max(maxend + arr[i], arr[i]);
      res = Math.max(maxend, res);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { -3, 8, -2, 4, -5, 6 };
    System.out.print(maxSubArraySum(arr, arr.length));
  }

}
