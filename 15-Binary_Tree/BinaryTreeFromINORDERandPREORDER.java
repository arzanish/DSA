
public class BinaryTreeFromINORDERandPREORDER {

  public static void main(String[] args) {
    int in[] = { 20, 10, 40, 30, 50 };
    int pre[] = { 10, 20, 30, 40, 50 };
    int n = in.length;
    Node root = BTFromInPre(in, pre, 0, n - 1);
    inorder(root);
  }

  static int preIndex = 0;

  static Node BTFromInPre(int[] in, int[] pre, int is, int ie) {
    if (is > ie)
      return null;
    Node root = new Node(pre[preIndex++]);

    int index = 0;
    for (int i = is; i <= ie; i++) {
      if (in[i] == root.key) {
        index = i;
        break;
      }
    }

    root.left = BTFromInPre(in, pre, is, index - 1);
    root.right = BTFromInPre(in, pre, index + 1, ie);
    return root;
  }

  public static void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.key + " ");
      inorder(root.right);
    }
  }
}
