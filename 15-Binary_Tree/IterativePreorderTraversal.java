public class IterativePreorderTraversal {
  static void iterativePreorder(Node root) {
    if (root == null)
      return;
    Stack<Node> st = new Stack<>();
    st.add(root);
    while (st.isEmpty() == false) {
      Node temp = st.pop();
      System.out.print(temp.data + " ");
      if (temp.right != null)
        st.add(temp.right);
      if (temp.left != null)
        st.add(temp.left);
    }
  }

}

class Node {
  int data;
  Node left, right;

  Node(int x) {
    data = x;
  }
}
