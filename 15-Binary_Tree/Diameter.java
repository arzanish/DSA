public class Diameter {

  static int res = 0;

  public static void main(String[] args) {

    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(60);
    root.right.left.left = new Node(50);
    root.right.right.right = new Node(70);

    System.out.println("Height: " + Diameter(root));
    System.out.println("Diameter: " + res);
  }

  static int Diameter(Node root) {
    if (root == null)
      return 0;
    int lh = Diameter(root.left);
    int rh = Diameter(root.right);
    res = Math.max(res, lh + rh + 1);
    return 1 + Math.max(lh, rh);
  }
}
