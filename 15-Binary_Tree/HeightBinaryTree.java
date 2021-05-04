// Note: in this program i am taking height = No. of nodes (and not No. of edges)
public class HeightBinaryTree {

  public static void main(String[] ats) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(50);

    System.out.print(height(root));
  }

  static int height(Node root) {
    if (root == null)
      return 0;
    else
      return 1 + Math.max(height(root.left), height(root.right));
  }
}
