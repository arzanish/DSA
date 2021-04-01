public class p {

  boolean equilibrium(int[] arr) {
    int pre_sum = 0;
    int l_sum = 0;
    for (int x : arr)
      pre_sum += x;
    for (int i = 0; i < arr.length; i++) {
      if (l_sum == pre_sum - arr[i])
        return true;
      l_sum += arr[i];
      pre_sum -= arr[i];
    }
  }

  public static void main(String[] args) {

  }
}
