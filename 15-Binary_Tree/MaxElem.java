public class MaxElem {

  public static void main(String[] args) {
    Node root = new Node(20);
    root.left = new Node(80);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(50);

    System.out.print(maxElem(root));
  }

  static int maxElem(Node root) {
    if (root == null)
      return 0;
    else {
      return Math.max(root.key, Math.max(maxElem(root.left), maxElem(root.right)));
    }
  }
}
