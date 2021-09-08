import java.util.Stack;

public class IterativeInorderTraversal {
  static void interativeInorder(Node root) {
    Stack<Node> st = new Stack<>();
    Node curr = root;
    while (curr != null || st.isEmpty() == false) {
      while (curr != null) {
        st.add(curr);
        curr = curr.left;
      }
      Node temp = st.pop();
      System.out.print(temp.data + " ");
      curr = temp.right;
    }
  }
}

class Node {
  int data;
  Node right;
  Node left;

  Node(int x) {
    data = x;
  }
}
