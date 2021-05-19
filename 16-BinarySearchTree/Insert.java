public class Insert {

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(15);
    root.right.left = new Node(12);
    root.right.right = new Node(18);
    int x = 20;

    root = insertR(root, x);
    inorder(root);
  }

  static Node insertR(Node root, int x) {
    if (root == null)
      return new Node(x);
    if (root.key > x)
      root.left = insertR(root.left, x);
    else if (root.key < x)
      root.right = insertR(root.right, x);
    return root;
  }

  static Node insertL(Node root, int x) {
    Node temp = new Node(x);
    Node parent = null, curr = root;
    while (curr != null) {
      parent = curr;
      if (curr.key > x)
        curr = curr.left;
      else if (curr.key < x)
        curr = curr.right;
      else
        return root;
    }
    if (parent == null)
      return temp;
    else if (parent.key > x)
      parent.left = temp;
    else
      parent.right = temp;

    return root;
  }

  static void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.key + " ");
      inorder(root.right);
    }
  }
}
