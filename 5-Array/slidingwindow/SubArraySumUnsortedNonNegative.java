package slidingwindow;

public class SubArraySumUnsortedNonNegative {

  static boolean subArraySumUnsortedNonNegative(int[] arr, int n, int sum) {
    int curr_sum = arr[0];
    int s = 0;
    for (int e = 1; e < n; e++) {
      while (curr_sum > sum && s < e - 1) {
        curr_sum -= arr[s];
        s++;
      }
      if (curr_sum == sum)
        return true;

      curr_sum += arr[e];
    }
    return (curr_sum == sum);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 20, 3, 10, 5 };
    int sum = 33;
    System.out.println("SubArray Exist :" + subArraySumUnsortedNonNegative(arr, 6, sum));
  }
}
