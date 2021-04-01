import java.util.Arrays;

public class ChocolateDistribution {

  static int min(int x, int y) {
    return x > y ? y : x;
  }

  static int minDiff(int[] arr, int n, int m) {
    if (m > n)
      return -1;
    else {
      Arrays.sort(arr);
      int res = arr[m - 1] - arr[0];
      for (int i = 1; i + m - 1 < n; i++) {
        res = min(res, (arr[i + m - 1] - arr[i]));
      }
      return res;
    }
  }

  public static void main(String[] args) {
    // int[] arr = { 7, 3, 2, 4, 9, 12, 56 }; // o/p:2
    // int m = 3;
    int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
    int m = 5;
    System.out.print(minDiff(arr, arr.length, m));
  }
}
