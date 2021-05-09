public class LeftViewBinaryTreeRecursive {
  static int maxLevel = 0;

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(50);

    leftViewRecursive(root, 1); // always pass 1 in the second parameter
  }

  static void leftViewRecursive(Node root, int level) {
    if (root == null)
      return;
    if (maxLevel < level) {
      System.out.print(root.key + " ");
      maxLevel = level;
    }
    leftViewRecursive(root.left, level + 1);
    leftViewRecursive(root.right, level + 1);
  }
}
