package prefixsum;

public class Q1 {

  static int[] prefix_sum(int[] arr, int n) {
    int[] sum_arr = new int[n];
    sum_arr[0] = arr[0];
    for (int i = 1; i < n; i++) {
      sum_arr[i] = sum_arr[i - 1] + arr[i];
    }
    return sum_arr;
  }

  static int getSum(int[] sum_arr, int l, int r) {
    if (l != 0)
      return (sum_arr[r] - sum_arr[l - 1]);
    else
      return sum_arr[r];
  }

  public static void main(String[] args) {
    int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
    int[] ps = prefix_sum(arr, 7);
    System.out.println(getSum(ps, 0, 2));
    System.out.println(getSum(ps, 1, 3));
  }
}
