package Pattern_Searching;

public class Naive {

  public static void naive(String txt, String pat) {
    int m = pat.length();
    int n = pat.length();
    for (int i = 0; i <= n - m; i++) {
      int j;
      for (j = 0; j < m; j++) {
        if (pat.charAt(j) != txt.charAt(j + i))
          break;

      }
      if (j == m)
        System.out.println(i);
    }
  }
}
