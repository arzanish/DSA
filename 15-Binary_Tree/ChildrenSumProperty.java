public class ChildrenSumProperty {

  public static void main(String[] agrs) {
    Node root = new Node(20);
    root.left = new Node(8);
    root.right = new Node(12);
    root.right.left = new Node(3);
    root.right.right = new Node(9);

    System.out.print(isCSum(root));
  }

  static boolean isCSum(Node root) {
    if (root == null)
      return true;
    if (root.left == null && root.right == null)
      return true;
    int sum = 0;
    if (root.left != null)
      sum += root.left.key;
    if (root.right != null)
      sum += root.right.key;

    return (sum == root.key && isCSum(root.left) && isCSum(root.right));
  }
}
