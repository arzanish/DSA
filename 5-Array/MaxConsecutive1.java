public class MaxConsecutive1 {

  public static int max1s(int[] arr, int n) {
    int res = 0;
    int curr = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0)
        curr = 0;
      else {
        curr++;
        res = Math.max(curr, res);
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
    System.out.println(max1s(arr, arr.length));
  }
}
