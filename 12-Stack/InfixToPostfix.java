import java.util.Stack;

public class InfixToPostfix {

  public static int precedence(char c) {
    switch (c) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    default:
      return -1;
    }
  }

  public static String infixToPostfix(String str) {
    String result = "";
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isLetterOrDigit(c))
        result += c;
      else if (c == '(')
        st.push(c);
      else if (c == ')') {
        while (!st.isEmpty() && st.peek() != '(')
          result += st.pop();
        st.pop();
      } else { // operator found
        while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
          result += st.pop();
        }
        st.push(c);
      }
    }
    while (!st.isEmpty()) {
      if (st.peek() == '(')
        return "Invalid Expression";
      result += st.pop();
    }

    return result;

  }

  public static void main(String[] args) {
    String exp = "a+b/c-d*e";
    System.out.println(infixToPostfix(exp));
  }

}
