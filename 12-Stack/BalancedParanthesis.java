import java.util.Stack;

public class BalancedParanthesis {

  public static boolean matching(char a, char b) {
    return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
  }

  public static boolean isBalanced(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
        s.add(str.charAt(i));
      else {
        if (s.isEmpty())
          return false;
        else if (matching(s.peek(), str.charAt(i)) == false)
          return false;
        else
          s.pop();
      }

    }
    return (s.isEmpty() == true);
  }

  public static void main(String[] agrs) {
    String str = "[{[]})]";
    System.out.println(isBalanced(str));
  }
}
