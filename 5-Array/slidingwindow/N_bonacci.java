package slidingwindow;

public class N_bonacci {

  static void n_bonacci(int n, int m) {
    int[] arr = new int[m];
    int i;
    for (i = 0; i < m; i++)
      arr[i] = 0;
    arr[n - 1] = 1;
    arr[n] = 1;
    for (i = n + 1; i < m; i++) {
      arr[i] = (2 * arr[i - 1] - arr[i - n - 1]);
    }
    for (i = 0; i < m; i++)
      System.out.println(arr[i]);
  }

  public static void main(String[] args) {
    n_bonacci(3, 8);
  }
}
