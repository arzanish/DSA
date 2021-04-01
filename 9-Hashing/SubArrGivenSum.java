import java.util.HashSet;

public class SubArrGivenSum {

  static boolean findSubArr(int[] arr, int sum) {
    int pre_sum = 0;
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      pre_sum += arr[i];
      if (pre_sum == sum)
        return true;
      if (hs.contains(pre_sum - sum))
        return true;
      hs.add(arr[i]);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 5, 8, 6, 13, 3, -1 };
    System.out.print(findSubArr(arr, 22));
  }

}
