import java.util.Stack;

public class PostfixEvaluation {

  public static int calculation(int a, int b, char c) {
    switch (c) {
    case '+':
      return a + b;
    case '-':
      return a - b;
    case '/':
      return a / b;
    case '*':
      return a * b;
    default:
      return 0;

    }
  }

  public static int postfixEvaluation(String str) {
    Stack<Character> st = new Stack<>();
    int res = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == ' ')
        continue;
      else {
        if (!Character.isDigit(c))
          st.push(c);
        else {
          int a = Integer.parseInt(String.valueOf(st.pop()));
          int b = Integer.parseInt(String.valueOf(st.pop()));
          res += calculation(a, b, c);
        }
      }

    }
    return res;
  }

  public static void main(String[] args) {
    String str = "10 2 * 3 5 * + 9 -";
    System.out.print(postfixEvaluation(str));
  }
}
