import java.util.*;

public class IntersectionArrays {
  static int intersection(int[] arr1, int[] arr2) {
    HashSet<Integer> h = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      h.add(arr1[i]);
    }
    int res = 0;
    for (int x : arr2) {
      if (h.contains(x)) {
        res++;
        System.out.println(x);
        h.remove(x);
      }
    }
    return res;

  }

  public static void main(String[] args) {
    int arr1[] = new int[] { 15, 17, 27, 27, 28, 15 };
    int arr2[] = new int[] { 16, 17, 28, 17, 31, 17 };

    System.out.println(intersection(arr1, arr2));
  }
}