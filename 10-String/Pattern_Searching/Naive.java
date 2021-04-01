package Pattern_Searching;

// Time Complexity O((n-m+1)*m)
public class Naive {

  public static void naive(String txt, String pat) {
    int m = pat.length();
    int n = txt.length();
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

  public static void main(String[] args) {
    String txt = "GEEKSFORGEEKS";
    String pat = "EKS";
    naive(txt, pat);
  }
}
