public class Anagram {

  static final int CHAR = 256;

  public static boolean isAnagram(String str, String ang) {
    if (str.length() != ang.length())
      return false;

    int[] count = new int[CHAR];
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
      count[ang.charAt(i)]--;
    }
    for (int i = 0; i < CHAR; i++) {
      if (count[i] != 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "listen";
    String ang = "s";
    System.out.print(isAnagram(str, ang));
  }
}
