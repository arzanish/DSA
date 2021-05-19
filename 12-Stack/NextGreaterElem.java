import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElem {

  public static ArrayList nextGreaterElem(int[] arr) {
    int n = arr.length;
    ArrayList<Integer> al = new ArrayList<>();
    Stack<Integer> s = new Stack<>();
    s.add(arr[n - 1]);
    al.add(-1);
    for (int i = n - 2; i > -1; i--) {
      while (s.isEmpty() == false && s.peek() <= arr[i])
        s.pop();
      int ng = s.isEmpty() ? -1 : s.peek();
      al.add(ng);
      s.add(arr[i]);
    }
    Collections.reverse(al);
    return al;
  }

  public static void main(String[] arhs) {
    int[] arr = { 5, 15, 10, 8, 6, 12, 9, 18 };
    ArrayList<Integer> al = nextGreaterElem(arr);
    for (int x : al) {
      System.out.print(x + " ");
    }
  }
}
