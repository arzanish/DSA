package prefixsum;

public class SplitIntoThree {

  static int splitIntoThree(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++)
      sum += arr[i];
    if (sum % 3 != 0)
      return 0;

    int s1 = -1;
    int s2 = -1;
    int presum = 0;
    for (int i = 0; i < n; i++) {
      presum = presum + arr[i];
      if (presum == (sum / 3) && s1 == -1)
        s1 = i;
      else if (presum == (2 * (sum / 3)) && s2 == -1) {
        s2 = i;
        break;
      }
    }

    if (s1 == -1 && s2 == -1)
      return -1;
    else {
      System.out.println("(" + s1 + "," + s2 + ")");
      return 1;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 6, 1, 1, 1, 5 };
    // int[] arr = { 2, 3, 4 };
    int n = splitIntoThree(arr, arr.length);
    System.out.print(n);
  }
}
