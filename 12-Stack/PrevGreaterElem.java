import java.util.Stack;

public class PrevGreaterElem {

  public static void prevGreaterElem(int arr[]) {

    Stack<Integer> s = new Stack<>();
    int n = arr.length;
    s.add(arr[0]);
    for (int i = 0; i < n; i++) {
      while (s.isEmpty() == false && s.peek() <= arr[i])
        s.pop();
      int pg = s.isEmpty() ? -1 : s.peek();
      System.out.print(pg + " ");
      s.add(arr[i]);
    }

  }

  public static void main(String[] agrs) {
    int[] arr = { 20, 30, 10, 5, 15 };
    prevGreaterElem(arr);
  }

}
