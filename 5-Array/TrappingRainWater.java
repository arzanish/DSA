public class TrappingRainWater {

  public static int trappingRainWater(int[] arr, int n) {
    int[] lmax = new int[n];
    int[] rmax = new int[n];
    int res = 0;

    lmax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      lmax[i] = Math.max(arr[i], lmax[i - 1]);
    }
    rmax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rmax[i] = Math.max(arr[i], rmax[i + 1]);
    }

    for (int i = 1; i < n - 1; i++) {
      res += Math.min(lmax[i], rmax[i]) - arr[i];
    }
    return res;
  }

  public static void main(String[] args) {
    // int arr[] = { 5, 0, 5, 2, 3 };
    int arr[] = { 7, 4, 0, 9 };
    System.out.println(trappingRainWater(arr, arr.length));
  }
}
