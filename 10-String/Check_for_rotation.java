public class Check_for_rotation {

  static boolean checkRotation(String str1, String str2) {
    if (str1.length() != str2.length())
      return false;
    else
      return (str1 + str1).indexOf(str2) >= 0;
  }

  public static void main(String[] args) {
    System.out.println(checkRotation("abcd", "cdaa"));
  }
}
