package slidingwindow;

public class SubArraySum {

  static boolean subArraySum(int[] arr, int n, int k, int sum) {
    int curr_sum = 0;
    int i;
    for (i = 0; i < k; i++)
      curr_sum += arr[i];
    if (curr_sum == sum)
      return true;

    for (i = k; i < n; i++) {
      curr_sum += arr[i] - arr[i - k];
      if (curr_sum == sum)
        return true;
    }
    return (curr_sum == sum);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 8, 30, -5, 20, 7 }; // 45 k=3
    int[] arr2 = { 5, -10, 6, 90, 3 };// 96 k=2
    int k = 2;
    boolean res = subArraySum(arr, 6, k, 45);
    res = subArraySum(arr2, 5, k, 90);
    System.out.println("result : " + res);
  }
}
