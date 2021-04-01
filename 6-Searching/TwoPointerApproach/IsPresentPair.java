package TwoPointerApproach;

public class IsPresentPair {

  static boolean isPresent(int[] arr, int n, int x) {
    int left = 0;
    int right = n - 1;
    while (left < right) {
      if (arr[left] + arr[right] == x)
        return true;
      else if (arr[left] + arr[right] > x)
        right--;
      else
        left++;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 8, 12, 30 };
    int x = 17;
    System.out.println(isPresent(arr, arr.length, x));
  }
}
