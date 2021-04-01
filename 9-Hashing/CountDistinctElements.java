import java.util.*;

public class CountDistinctElements {

  static int countDistinct1(int[] arr) {
    HashSet<Integer> S = new HashSet<>();
    for (int i = 0; i < arr.length; i++)
      S.add(arr[i]);
    return S.size();
  }
  // below written method is better but currently has some errors
  // static int countDistinct2(int[] arr) {
  // HashSet<Integer> S = new HashSet<>(Arrays.asList(arr));
  // return S.size();
  // }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 2, 5, 6 };
    System.out.print(countDistinct1(arr));
  }
}
