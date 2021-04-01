import java.util.Arrays;

public class MinDiff_inArray {

  static int min(int x, int y) {
    return x > y ? y : x;
  }

  static int mdiff(int[] arr, int n) {
    int res = Integer.MAX_VALUE;
    Arrays.sort(arr);
    for (int i = 1; i < n; i++) {
      res = min(res, (arr[i] - arr[i - 1]));
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 12, 5, 18 };
    System.out.print(mdiff(arr, arr.length));
  }
}
