public class SubsequenceCheck {
  public static boolean isSubsequenceIterative(String str, String sub) {
    int j = 0;
    int il = str.length();
    int jl = sub.length();
    for (int i = 0; i < il && j < jl; i++) {
      if (str.charAt(i) == sub.charAt(j)) {
        j++;
      }
    }
    return (j == jl);
  }

  public static boolean isSubsequenceRecursive(String str, String sub, int n, int m) {
    if (m == 0)
      return true;
    if (n == 0)
      return false;
    if (n < m)
      return false;
    if (str.charAt(n - 1) == sub.charAt(m - 1))
      return isSubsequenceRecursive(str, sub, n - 1, m - 1);
    else
      return isSubsequenceRecursive(str, sub, n - 1, m);
  }

  public static void main(String[] args) {
    String str = "ABCDEF";
    String sub = "FED";
    System.out.print(isSubsequenceRecursive(str, sub, str.length(), sub.length()));
  }
}
