public class Ceiling {

  public static void main(String[] args) {
    Node root = new Node(15);
    root.left = new Node(5);
    root.left.left = new Node(3);
    root.right = new Node(20);
    root.right.left = new Node(18);
    root.right.left.left = new Node(16);
    root.right.right = new Node(80);
    int x = 17;

    System.out.print("Ceil: " + (ceiling(root, 17).key));
  }

  static Node ceiling(Node root, int x) {
    Node res = null;
    while (root != null) {
      if (root.key == x)
        return root;
      else if (root.key > x) {
        res = root;
        root = root.left;
      } else
        root = root.right;
    }
    return res;
  }
}
