public class MaximumDiffProb {

  public static int maxDiff(int[] arr, int size) {
    int minval = arr[0];
    int res = arr[1] - arr[0];
    for (int j = 1; j < size; j++) {
      res = Math.max(arr[j] - minval, res);
      minval = Math.min(minval, arr[j]);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
    System.out.print(maxDiff(arr, arr.length));
  }
}
