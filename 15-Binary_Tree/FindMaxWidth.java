import java.util.LinkedList;
import java.util.Queue;

public class FindMaxWidth {

  public static void main(String[] args) {

    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.right = new Node(50);
    root.right.left = new Node(60);

    System.out.print(maxWidth(root));
  }

  static int maxWidth(Node root) {
    if (root == null)
      return 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int maxCount = 0;
    while (!q.isEmpty()) {
      int count = q.size();
      maxCount = Math.max(count, maxCount);
      for (int i = 0; i < count; i++) {
        Node curr = q.poll();
        if (curr.left != null)
          q.add(curr.left);
        if (curr.right != null)
          q.add(curr.right);
      }
    }
    return maxCount;
  }
}
