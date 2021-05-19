public class Delete {

  public static void main(String[] args) {

  }

  static Node succ(Node root) {
    // this only works for this particular deletion program.
    Node curr = root.right;
    while (curr != null && curr.left != null)
      curr = curr.left;
    return curr;
  }

  static Node del(Node root, int x) {
    if (root == null)
      return null;
    if (root.key > x)
      root.left = del(root.left, x);
    else if (root.key < x)
      root.right = del(root.right, x);
    else {
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;
      else {
        Node succesor = succ(root);
        root.key = succesor.key;
        root.right = del(root.right, succesor.key);// deleting the succesor
      }

    }
    return root;
  }
}
