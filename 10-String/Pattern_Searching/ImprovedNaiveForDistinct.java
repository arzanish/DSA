package Pattern_Searching;

// time complexity : theta(n) it works for distinct pattern elements only
public class ImprovedNaiveForDistinct {

  public static void improvedNaiveForDistinct(String txt, String pat) {
    int n = txt.length();
    int m = pat.length();
    for (int i = 0; i < n - m;) {
      int j;
      for (j = 0; j < m; j++) {
        if (pat.charAt(j) != txt.charAt(j + i))
          break;
      }
      if (j == m)
        System.out.println(i + " ");
      if (j == 0)
        i++;
      else
        i += j;

    }
  }

  public static void main(String[] args) {
    String txt = "ABCABCDAB";
    String pat = "ABCD";
    String txt1 = "GEEKFORGEEKS";
    String pat1 = "EK";
    improvedNaiveForDistinct(txt1, pat1);
  }
}