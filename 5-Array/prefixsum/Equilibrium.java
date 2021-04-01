package prefixsum;

public class Equilibrium {

  static boolean equilibrium(int[] arr, int n) {
    int i;
    int sum = 0;
    for (i = 0; i < n; i++)
      sum = sum + arr[i];
    int l_sum = 0;
    for (i = 0; i < n; i++) {
      if (l_sum == (sum - arr[i]))
        return true;
      l_sum += arr[i];
      sum -= arr[i];

    }

    return false;
  }

  public static void main(String[] args) {
    // int[] arr = { 3, 4, 8, -9, 20, 6 }; // true
    int[] arr = { 4, 2, 2 }; // false
    System.out.println(equilibrium(arr, arr.length));
  }

}
