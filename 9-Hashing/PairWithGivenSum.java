import java.util.HashSet;

public class PairWithGivenSum {

  static boolean findPair(int[] arr, int sum) {
    HashSet<Integer> h = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (h.contains(sum - arr[i]))
        return true;
      h.add(arr[i]);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 3, 8, 4, 7, 6, 1 };
    int x = 14;
    System.out.println(findPair(arr, x));
  }
}
