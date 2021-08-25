import java.util.*;

public class Generate_Numbers_With_Given_Digits {

  static void printFirstN(int n) {
    Queue<String> q = new LinkedList<>();

    q.add("5");
    q.add("6");

    for (int i = 0; i < n; i++) {
      String curr = q.poll();

      System.out.print(curr + " ");

      q.add(curr + "5");
      q.add(curr + "6");
    }

  }

  public static void main(String[] args) {
    printFirstN(10);
    // System.out.print(max_Consecutive_1s(arr));
  }

}
