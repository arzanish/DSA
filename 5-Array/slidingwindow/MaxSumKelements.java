package slidingwindow;

public class MaxSumKelements {

  static int maxSumKelements(int[] arr, int n, int k) {
    int curr_sum = 0;
    int i;
    for (i = 0; i < k; i++)
      curr_sum += arr[i];
    int max_sum = curr_sum;
    for (i = k; i < n; i++) {
      curr_sum = curr_sum + arr[i] - arr[i - k];
      max_sum = (max_sum > curr_sum) ? max_sum : curr_sum;
    }
    return max_sum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 8, 30, -5, 20, 7 }; // 45 k=3
    int[] arr2 = { 5, -10, 6, 90, 3 };// 96 k=2
    int k = 2;
    int res = maxSumKelements(arr, 6, k);
    res = maxSumKelements(arr2, 5, k);
    System.out.println("Max Sum : " + res);
  }

}
