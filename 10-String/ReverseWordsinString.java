public class ReverseWordsinString {

  public static void revWords(char[] str, int n) {
    int start = 0;
    for (int end = 0; end < n; end++) {
      // here the last word wont be reversed
      if (str[end] == ' ') {
        reverse(str, start, end - 1);
        start = end + 1;
      }
    }
    reverse(str, start, n - 1); // for the last word
    reverse(str, 0, n - 1);
  }

  public static void reverse(char[] str, int start, int end) {
    while (start <= end) {
      char temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    String s = "Welcome to Gfg";
    int n = s.length();
    char[] str = s.toCharArray();
    System.out.println("After reversing words in the string:");
    revWords(str, n);
    System.out.println(str);
  }
}
