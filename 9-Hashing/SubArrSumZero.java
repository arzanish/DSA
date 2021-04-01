import java.util.HashSet;

public class SubArrSumZero {

  static boolean is0SubArray(int[] arr) {
    int p_sum = 0;
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      p_sum += arr[i];
      if (hs.contains(p_sum))
        return true;
      if (p_sum == 0)
        return true;
      hs.add(p_sum);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 5, 3, 9, -4, -6, 7, -1 };

    System.out.println(is0SubArray(arr));
  }

}
